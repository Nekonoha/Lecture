package newlang4;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Expr extends Node {
    Node body;
    LexicalUnit lu;
    Node child;

    private static Set<LexicalType> firstSet = new HashSet<LexicalType>();

    static {
        firstSet.add(LexicalType.NAME);
        firstSet.add(LexicalType.SUB);
        firstSet.add(LexicalType.LP);
        firstSet.add(LexicalType.INTVAL);
        firstSet.add(LexicalType.DOUBLEVAL);
        firstSet.add(LexicalType.LITERAL);
    }

    public Expr(Environment env) {
        super.env = env;
        super.type = NodeType.EXPR;
    }

    public static Node isMatch(Environment env, LexicalUnit first) {
        if (!firstSet.contains(first.getType())) return null;
        return new Expr(env);
    }

    public boolean Parse() throws Exception {
        lu = env.getInput().get();
        if (firstSet.contains((lu.getType()))) {
            child = CallFunc.isMatch(env, lu);
            if(child != null){
                if (child.Parse()) {
                    list.add(child);
                    lu = env.getInput().get();
                    return recursion(lu);
                }
            }
            switch (lu.getType()) {
                case LP:
                    lu = env.getInput().get();
                    child = Expr.isMatch(env, lu);
                    env.getInput().unget(lu);
                    if (child != null) {
                        if (child.Parse()) {
                            list.add(child);
                            lu = env.getInput().get();
                            if (lu.getType() == LexicalType.RP) {

                                lu = env.getInput().get();
                                return recursion(lu);
                            }
                        }
                    }
                case SUB:
                    list.add(lu);
                    lu = env.getInput().get();
                    recursionExpr(lu);
                case NAME:
                case INTVAL:
                case DOUBLEVAL:
                case LITERAL:
                    ArrayList name_list = new ArrayList();
                    name_list.add(lu);
                    list.add(name_list);
                    lu = env.getInput().get();
                    return recursion(lu);

            }
        }

        return false;
    }

    private boolean recursion(LexicalUnit lu) throws Exception {
        switch (lu.getType()) {
            case ADD:
            case SUB:
            case MUL:
            case DIV:
                list.add(lu);
                lu = env.getInput().get();
                return recursionExpr(lu);
            default:
                env.getInput().unget(lu);
                return true;
        }
    }

    private boolean recursionExpr(LexicalUnit lu) throws Exception {
        child = Expr.isMatch(env, lu);
        env.getInput().unget(lu);
        if (child != null) {
            if (child.Parse()) {
                list.add(child);
                return true;
            }
        }
        return false;
    }

//        while (true) {
//            lu = env.getInput().get();
//
//
//            switch (lu.getType()) {
//                case NL:
//                case EOF:
//                case END:
//                    env.getInput().unget(lu);
//                    return true;
//            }
//
//            if (firstSet.contains(lu.getType())) {
//                body = CallFunc.isMatch(env, lu);
//                if (body != null) {
//                    env.getInput().unget(lu);
//                    if (body.Parse()) {
//                        list.add(body.list);
//
//                        lu = env.getInput().get();
//                        switch (lu.getType()) {
//                            case ADD:
//                            case SUB:
//                            case MUL:
//                            case DIV:
//                                list.add(lu);
//                                continue;
//                            case NL:
//                            case EOF:
//                            case END:
//                                env.getInput().unget(lu);
//                                return true;
//                        }
//                    }
//                }
//
//
//                switch (lu.getType()) {
//
//                    case NAME:
//                    case INTVAL:
//                    case DOUBLEVAL:
//                    case LITERAL:
//
//                        list.add(lu);
//
//                        lu = env.getInput().get();
//                        switch (lu.getType()) {
//                            case ADD:
//                            case SUB:
//                            case MUL:
//                            case DIV:
//                                list.add(lu);
//                                lu = env.getInput().get();
//                                child = Expr.isMatch(env, lu);
//                                if (child != null) {
//                                    System.out.println(lu);
//
//                                    env.getInput().unget(lu);
//                                    if (child.Parse()) {
//                                        list.add(child.list);
//                                        lu = env.getInput().get();
//                                    }
//                                }
//
//                                continue;
//                            case NL:
//                            case EOF:
//                            case END:
//                                env.getInput().unget(lu);
//                                return true;
//                            default:
//                                env.getInput().unget(lu);
//                                return true;
//                        }
//                    case LP:
//                        lu = env.getInput().get();
//
//                        child = Expr.isMatch(env, lu);
//                        env.getInput().unget(lu);
//                        if (child.Parse()) {
//
//                            list.add(child.list);
//                            lu = env.getInput().get();
//
//                            if (lu.getType() == LexicalType.RP) continue;
//                        }
//                    default:
//                        env.getInput().unget(lu);
//                        return true;
//                }
//            }
//        }
//    }
}
