//import java.io.StringBufferInputStream;

/*
 Note: StringBuffer is a peer class of String that provides much of the functionality of strings. String represents fixed-length, 
 immutable character sequences while StringBuffer represents growable and writable character sequences. StringBuffer may
  have characters and substrings inserted in the middle or appended to the end. It will automatically grow to make room for such 
  additions and often has more characters preallocated than are actually needed, to allow room for growth.

1) Write an application to append the following strings “StringBuffer”, 
“is a peer class of String”, “that provides much of “, 
“the functionality of strings” using a StringBuffer.

2) Insert the following string “insert text” into the string “It is used to _ at the 
specified index position” at the location denoted by the sign _

3) Reverse the following string “This method returns the reversed object on 
which it was called” using StringBuffer Class
 
 */

public class StringBufferAssignment {

	public static void main(String[] args) {

		StringBuffer str =new StringBuffer ("StringBuffer");
		System.out.println(str.append(" is a peer class of String"));
		System.out.println(str.append("that provides much of"));
		System.out.println(str.append(" the functionality of strings"));
		System.out.println("*****************************************");
		StringBuffer str1=new StringBuffer();
		System.out.println(str1.append("It is used to _ at the specified index position" ));
		System.out.println(str1.indexOf("_"));
		System.out.println(str1.insert(14,"Insert text"));
//		System.out.println(str1);
		System.out.println("*****************************************");
		StringBuffer str2=new StringBuffer("This method returns the reversed object on which it was called StringBuffer ");
		System.out.println(str2.reverse());
	
	}

}
