/*
 Replace every word in the list with its upper case equivalent. Use replaceAll() method & Unary Operator interface.
 */

import java.util.Arrays;
import java.util.List;

public class Assignment4Q6 {
	
	
    public static void main(String[] args) {
    	 List<String> data = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    	String delim=" ";
    	String res = String.join(delim, data);
    	System.out.println(res.toUpperCase());
    	
	
    }
}