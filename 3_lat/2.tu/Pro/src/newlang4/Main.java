package newlang4;

import java.io.FileInputStream;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        FileInputStream fin = null;
        LexicalAnalyzer lex;
        LexicalUnit first;
        Environment env;
        Node program;

        System.out.println("basic parser");
        fin = new FileInputStream("./src/txt/TEST");
        lex = new LexicalAnalyzerImpl(fin);
        env = new Environment(lex);
        first = lex.get();
        lex.unget(first);


        program = Program.isMatch(env, first);
        if (program.Parse()) {
            System.out.println(program.list);
            System.out.println("value = " + program.getValue());
        } else System.out.println("syntax error");
    }

}
