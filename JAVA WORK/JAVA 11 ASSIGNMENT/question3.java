import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/*
 “A quick brown fox jumps over the lazy dog”. Create an ArrayList from the given
String. Such an ArrayList should include each word from the given sentence. Finally
convert such List to an array using Java 11 methods and print the output.
 */
public class question3 {

	public static void main(String[] args) {
		String data="A quick brown fox jumps over the lazy dog";		
ArrayList<String> data1= new ArrayList<String>(Arrays.asList(data.split(" ")));
//data.add("A quick brown fox jumps over the lazy dog");
	System.out.println(data);
	System.out.println(data.getClass());
	String [] arr=data1.stream().toArray(size -> new String [size]);
	System.out.println(Arrays.toString(arr));

	String []arr2=data1.toArray(String[]::new);
	System.out.println(Arrays.toString(arr2));
	System.out.println(arr2.getClass());
	}

}
