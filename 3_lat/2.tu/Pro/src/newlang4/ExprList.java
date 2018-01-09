package newlang4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExprList extends Node {
    public List<Node> expr_list;
    LexicalUnit first;

    public ExprList(Environment env) {
        super.env = env;
        super.type = NodeType.EXPR_LIST;
        expr_list = new ArrayList<>();
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        return (Node) new ExprList(env);
    }

    @Override
    public boolean Parse() throws Exception {
        while (true) {
            first = env.getInput().get();

            //exprなら
            Node child = Expr.isMatch(env, first);
            env.getInput().unget(first);
            if(child != null) {


                if (child.Parse()) {
                    list.add(child);
                    expr_list.add(child);
                    first = env.getInput().get();
                    switch (first.getType()) {
                        case COMMA:
                            continue;
                        case NL:
                        case EOF:
                        case END:
                            return true;
                        default:
                            env.getInput().unget(first);
                            return true;
                    }
                }
            }
            return false;
        }
    }
}
