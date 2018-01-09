package newlang4;

import java.util.ArrayList;

public class CallFunc extends Node {
    Node body;

    public CallFunc(Environment env) {
        super.env = env;
        super.type = NodeType.FUNCTION_CALL;
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        if (first.getType() != LexicalType.NAME) return null;
        return (Node) new CallFunc(env);
    }

    public boolean Parse() throws Exception {
        LexicalUnit lu = env.getInput().get();

        if (lu.getType() != LexicalType.NAME) {
            env.getInput().unget(lu);
            return false;
        }

        list.add(lu);
        lu = env.getInput().get();

        if (lu.getType() != LexicalType.LP) {
            env.getInput().unget(lu);
            return false;
        }

        lu = env.getInput().get();

        body = ExprList.isMatch(env, lu);


        if (body != null) {
            env.getInput().unget(lu);
            if(body.Parse()){
                list.add(body);
                lu = env.getInput().get();
                return lu.getType() == LexicalType.RP;
            }
        }

        return false;
    }
}
