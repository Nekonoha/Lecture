package newlang4;

public class Program extends Node{
    Node stmt_list;

    public Program(Environment env) {
        super.env = env;
    }

    public static Node isMatch(Environment env, LexicalUnit first){
        if(first == null) return null;
        return (Node)new Program(env);
    }

    @Override
    public boolean Parse() throws Exception {
        LexicalUnit first = env.getInput().get();
        Node child = StmtList.isMatch(env, first);
        env.getInput().unget(first);
        if (child.Parse()){
            list = child.list;
            return true;
        }else{
            return false;
        }
    }
}
