import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
  Create a string that consists of the first letter of each word in the list of Strings provided. HINT: Use Consumer interface & a String Builder to construct the result.
 */

public class Assignement4Q5 {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        
    public static String processWords(List<String> list, Consumer<List<String>> consumer)
    {
    	consumer.accept(list);
    	return list.toString();
    }

    public static void main(String[] args) {
    	Consumer<List<String>> consumer= data ->
	   	 {
		   	for(int i=0;i<data.size();i++)
		   	{
		   		String word=list.get(i);
		   		data.set(i, ""+word.charAt(0));
		   	}
	   	 };
	   	System.out.println(processWords(list, consumer));
    }
}