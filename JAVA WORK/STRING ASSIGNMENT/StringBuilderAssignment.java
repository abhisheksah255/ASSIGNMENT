/*
 Note: StringBuilder: J2SE 5 adds a new string class to Java’s already powerful string handling
capabilities. This new class is called StringBuilder. It is identical to StringBuffer except for one
important difference: it is not synchronized, which means that it is not thread safe. The advantage
of StringBuilder is faster performance. However, in cases in which you are using multithreading,
you must use StringBuffer rather than StringBuilder.
 
 1) Write an application to append the following strings “StringBuilder”, 
“is a peer class of String”, “that provides much of “, 
“the functionality of strings” using a StringBuilder.

2) Insert the following string “insert text” into the string “It is used to _ at the 
specified index position” at the location denoted by the sign _

3) Reverse the following string “This method returns the reversed object on 
which it was called” using StringBuilder Class

 */
public class StringBuilderAssignment {

	public static void main(String[] args) {
	
		StringBuilder str =new StringBuilder ("StringBuilder");
		System.out.println(str.append(" is a peer class of String"));
		System.out.println(str.append("that provides much of"));
		System.out.println(str.append(" the functionality of strings"));
		System.out.println("*****************************************");
		StringBuilder str1=new StringBuilder();
		System.out.println(str1.append("It is used to _ at the specified index position" ));
		System.out.println(str1.indexOf("_"));
		System.out.println(str1.insert(14,"Insert text"));
		System.out.println("*****************************************");
		StringBuilder str2=new StringBuilder("This method returns the reversed object on which it was called StringBuilder ");
		System.out.println(str2.reverse());
	}

}
