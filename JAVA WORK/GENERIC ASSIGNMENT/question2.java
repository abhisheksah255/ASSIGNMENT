/*
Write an application to hold 10 random int values as keys and 10 random double values as
values for a HashMap. Print the data store in the HashMap. Note: Keys can only be int and
values double
 */
import java.util.*;
public class question2 {

	public static void main(String[] args) {
		Random rand=new Random();
	Map<Integer,Long> data=new HashMap<>();
	for(int i=0;i<=10;i++) {
		data.put(rand.nextInt(),rand.nextLong());
	}
for(@SuppressWarnings("rawtypes") Map.Entry m:data.entrySet()) {
	System.out.println("[This is the key:-->"+m.getKey()+" : "+m.getValue()+"<--This is the value ]");
}
	}

}
