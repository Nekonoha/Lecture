package newlang4;

public class Cond extends Node {
    Node child;
    LexicalUnit lu;

    public Cond(Environment env) {
        super.env = env;
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        return (Node) new Cond(env);
    }

    public boolean Parse() throws Exception {
        lu = env.getInput().get();
        if(parseExpr(lu)){
            lu = env.getInput().get();
            switch (lu.getType()){
                case EQ:
                case GT:
                case LT:
                case GE:
                case LE:
                case NE:
                    list.add(lu);
                    lu = env.getInput().get();
                    return parseExpr(lu);
            }
        }

        return false;
    }

    public boolean parseExpr(LexicalUnit lu) throws Exception {
        child = Expr.isMatch(env, lu);
        env.getInput().unget(lu);
        if(child != null){
            if(child.Parse()){
                list.add(child);
                return true;
            }
        }
        return false;
    }
}
