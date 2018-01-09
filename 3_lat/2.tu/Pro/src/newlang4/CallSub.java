package newlang4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CallSub extends Node {
    Node body;
    LexicalUnit lu;

    public CallSub(Environment env) {
        super.env = env;
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        if (first.getType() != LexicalType.NAME) return null;
        return (Node) new CallSub(env);
    }

    public boolean Parse() throws Exception {
        lu = env.getInput().get();

        if (lu.getType() != LexicalType.NAME) {
            env.getInput().unget(lu);
            return false;
        }

        ArrayList name_list = new ArrayList();
        name_list.add(lu);
        list.add(name_list);

        lu = env.getInput().get();

        body = ExprList.isMatch(env, lu);

        if (body != null) {
            env.getInput().unget(lu);
            if(body.Parse()){
                list.add(body);
                return true;
            }
        }

        return false;
    }
}
