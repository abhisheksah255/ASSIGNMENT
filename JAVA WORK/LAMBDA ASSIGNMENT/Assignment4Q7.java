
/*
 * Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.

 */
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment4Q7 {
	
	public static String convertKeyValueToString(HashMap<String, String> map) {
		
		String str = " [";
		Set<Entry<String, String>> s = map.entrySet();
		
		for(Entry<String, String> e : s) {
			str += e.getKey()+ ":->";
			str += e.getValue().toString()+ " ][";
		}
		return str;
	}
	
	
    public static void main(String[] args) {
    	HashMap<String, String> map = new HashMap<>();
    	map.put("abc", "First");
    	map.put("def", "Second");
    	map.put("ghi", "Third");
    	System.out.println(convertKeyValueToString(map));
    	
    }
    
    
}