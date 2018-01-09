package newlang4;

public class DoBlock extends Node {
    LexicalUnit lu;

    public DoBlock(Environment env) {
        super.env = env;
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        if (first.getType() != LexicalType.DO) return null;
        return (Node) new DoBlock(env);
    }

    @Override
    public boolean Parse() throws Exception {
        lu = env.getInput().get();

        //最初に来るのは絶対<DO>なので
        if (lu.getType() != LexicalType.DO) return false;
        list.add(lu);

        //<DO>の次をとる
        lu = env.getInput().get();

        switch (lu.getType()) {
            case WHILE:
            case UNTIL:
                //こうなる気がする
                list.add(lu);

                lu = env.getInput().get();
                if (parseWHILE(lu)) {
                    lu = env.getInput().get();
                    if (lu.getType() == LexicalType.NL) {
                        lu = env.getInput().get();
                        if (parseNL(lu)) {
                            lu = env.getInput().get();
                            if (lu.getType() == LexicalType.LOOP) {
                                list.add(lu);
                                lu = env.getInput().get();
                                return switchEND(lu);
                            }
                        }
                    }
                }
            case NL:
                //こうなる気がする
                lu = env.getInput().get();
                if (parseNL(lu)) {
                    lu = env.getInput().get();
                    if (lu.getType() == LexicalType.LOOP) {
                        if (parseWHILE(lu)) {
                            lu = env.getInput().get();
                            return switchEND(lu);
                        }
                    }
                }
            case END:
                return true;
        }
        return false;
    }

    private boolean parseNL(LexicalUnit lu) throws Exception {
        Node body = StmtList.isMatch(env, lu);
        env.getInput().unget(lu);
        if (body == null) return false;
        if (body.Parse()) {
            list.add(body);
            return true;
        } else {
            return false;
        }
    }

    private boolean parseWHILE(LexicalUnit lu) throws Exception {
        Node body = Cond.isMatch(env, lu);
        env.getInput().unget(lu);
        if (body == null) return false;
        if (body.Parse()) {
            list.add(body);
            return true;
        } else {
            return false;
        }
    }

    private boolean switchEND(LexicalUnit lu) throws Exception {
        switch (lu.getType()) {
            case NL:
                list.add(lu);
                return true;
            case END:
            case EOF:
                env.getInput().unget(lu);
                return true;
            default:
                return false;
        }
    }


}
