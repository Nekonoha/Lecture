package newlang4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StmtList extends Node {
    List<Node> stmt_list;
    Node child;
    LexicalUnit first;

    private static Set<LexicalType> firstSet = new HashSet<LexicalType>();


    private StmtList(Environment env) {
        super.env = env;
        stmt_list = new ArrayList<Node>();
    }

    static {
        firstSet.add(LexicalType.NAME);
        firstSet.add(LexicalType.FOR);
        firstSet.add(LexicalType.END);
        firstSet.add(LexicalType.NAME);
        firstSet.add(LexicalType.IF);
        firstSet.add(LexicalType.WHILE);
        firstSet.add(LexicalType.DO);
        firstSet.add(LexicalType.NL);
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        if (!firstSet.contains(first.getType())) return null;
        return (Node) new StmtList(env);
    }

    @Override
    public boolean Parse() throws Exception {
        while (true) {
            first = env.getInput().get();
            if(first.getType() != LexicalType.NL) break;
        }


        if (!firstSet.contains(first.getType())) {
            env.getInput().unget(first);
            return true;
        }


        child = Stmt.isMatch(env, first);
        if (child != null) {
            env.getInput().unget(first);
            if (child.Parse()) {
                list.add(child);
                first = env.getInput().get();
                return recursion(first);
            }
        }

        child = Block.isMatch(env, first);
        if (child != null) {
            env.getInput().unget(first);
            if (child.Parse()) {
                list.add(child);
                first = env.getInput().get();
                return recursion(first);
            }
        }


        return false;
    }

    private boolean recursion(LexicalUnit first) throws Exception {
        child = StmtList.isMatch(env, first);
        env.getInput().unget(first);
        if (child != null) {
            if (child.Parse()) {
                list.add(child);
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}

