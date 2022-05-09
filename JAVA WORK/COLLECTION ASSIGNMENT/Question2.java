
import java.util.HashSet;

/*
 2)	Write an application to store 10 unique product objects. In case there is an attempt to add a duplicate product, it should be silently rejected. Hint: Use HasSet or TreeSet

Extra(optional): Use ArrayList in the above solution. (This is optional)

 */
public class Question2 {
public static void main(String[] args) {
	HashSet<String> Name=new HashSet<>();
	Name.add("Abhishek");
	Name.add("Arvind");
	Name.add("Dhiru");
	Name.add("Akash");
	Name.add("Himanshu");
	Name.add("Ayush");
	Name.add("Manish");
	Name.add("Tanuj");
	Name.add("Yogesh");
	Name.add("Abhijeet");
	System.out.println("*****To Print the Name of 10 students by using HashSet ******");
for(String ab:Name) {
	System.out.println(ab);
	
}	
}
}
