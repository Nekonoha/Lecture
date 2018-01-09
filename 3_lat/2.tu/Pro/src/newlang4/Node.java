package newlang4;

import java.util.ArrayList;

public class Node {
    NodeType type;
    Environment env;
    ArrayList<Object> list = new ArrayList<>();

    /** Creates a new instance of Node */
    public Node() {
    }
    public Node(NodeType my_type) {
        type = my_type;
    }
    public Node(Environment my_env) {
        env = my_env;
    }
    
    public NodeType getType() {
        return type;
    }
    
    public boolean Parse() throws Exception {
        return true;
    }
    
    public Value getValue() throws Exception {
        return null;
    }
 
    public String toString() {
    	return list.toString();
    }

}
