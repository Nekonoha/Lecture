package newlang4;

import java.util.ArrayList;

public class Subst extends Node {
    Node body;
    LexicalUnit lu;

    public Subst(Environment env) {
        super.env = env;
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        if (first.getType() != LexicalType.NAME) return null;
        return (Node) new Subst(env);
    }

    public boolean Parse() throws Exception {
        lu = env.getInput().get();
        //最初は必ずNAME
        if (lu.getType() != LexicalType.NAME) {
            env.getInput().unget(lu);
            return false;
        }
        list.add(lu);

        lu = env.getInput().get();

        if (lu.getType() != LexicalType.EQ){
            env.getInput().unget(lu);
            return false;
        }
        list.add(lu);


        lu = env.getInput().get();
        env.getInput().unget(lu);
        body = Expr.isMatch(env, lu);
        if (body == null) return false;
        if (body.Parse()) {
            list.add(body);
            return true;
        } else {
            return false;
        }
    }
}
