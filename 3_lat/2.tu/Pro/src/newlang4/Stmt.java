package newlang4;

import java.util.HashSet;
import java.util.Set;

public class Stmt extends Node {
    Node body;

    private Stmt(Environment env) {
        super.env = env;
        super.type = NodeType.STMT;
    }


    private static Set<LexicalType> firstSet = new HashSet<LexicalType>();

    static {
        firstSet.add(LexicalType.NAME);
        firstSet.add(LexicalType.FOR);
        firstSet.add(LexicalType.END);
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        if (!firstSet.contains(first.getType())) {
            return null;
        }
        return new Stmt(env);
    }

    @Override
    public boolean Parse() throws Exception {
        LexicalUnit lu = env.getInput().get();

        if (lu.getType() == LexicalType.END) {
            super.type = NodeType.END;
            list.add(lu);
            return true;
        }

        body = CallFunc.isMatch(env, lu);
        if (body != null) {
            env.getInput().unget(lu);
            if (body.Parse()) {
                list.add(body);
                return true;
            }
        }

        body = Subst.isMatch(env, lu);
        if (body != null) {
            env.getInput().unget(lu);
            if (body.Parse()) {
                list.add(body);
                return true;
            }
        }

        body = CallSub.isMatch(env, lu);
        if (body != null) {
            env.getInput().unget(lu);
            if (body.Parse()) return true;
        }

        return false;

    }

}
