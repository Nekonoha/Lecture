package kg09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample01 {
    public static void main(String[] args){
        List data = new ArrayList();
        String s1 = "katakuramachi";
        String s2 = "Hachioji";
        String s3 = "Tokyo";
        int n = 100;
        Integer a = 100;
        
        data.add(s1);
        data.add(s2);
        data.add(s3);
        //data.add(a);
        //data.add(n);
        
        for (int i = 0; i < data.size(); i++) {
            String str = (String)data.get(i);
            System.out.println(str); 
        }
        
        for ( Iterator it = data.iterator(); it.hasNext(); ) {
            String str = (String)it.next();
            it.remove();
            System.out.println(str); 
        }
    }
}
