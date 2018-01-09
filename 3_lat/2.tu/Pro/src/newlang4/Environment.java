package newlang4;

import java.util.Hashtable;

public class Environment {
	   private LexicalAnalyzer input;
	   private Hashtable var_table;
	    
	    public Environment(LexicalAnalyzer my_input) {
	        this.input = my_input;
	        var_table = new Hashtable();
	    }
	    
	    public LexicalAnalyzer getInput() {
			return this.input;
	    }	    
}
