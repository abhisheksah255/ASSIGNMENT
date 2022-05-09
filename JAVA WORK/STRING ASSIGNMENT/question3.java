/*
 3) Given a String “Java String pool refers to collection of Strings 
  which are stored in heap memory”, perform the following operations 
  (Hint: all operation can be performed using String methods)
 
 a. Print the string to console in lowercase
b. Print the string to console in uppercase
c. Replace all ‘a’ character in the string with $ sign
d. Check if the original String contains the word “collection”
e. Check if the following String “java string pool refers to collection of strings which are stored in heap memory” matches the original
f. If the string does not match check if there is another method which can be used to check if the strings are equal
 */
public class question3 {

	public static void main(String[] args) {
		String str =new String("Java String pool refers to collection of Strings which are stored in heap memory");
System.out.println(str);
System.out.println("*****************************************");
System.out.println(str.toLowerCase());
System.out.println("*****************************************");
System.out.println(str.toUpperCase());
System.out.println("*****************************************");
System.out.println(str.replace("a", "$"));
System.out.println("*****************************************");
System.out.println(str);
System.out.println(str.contains("collection"));
System.out.println("*****************************************");
System.out.println(str.equals("java string pool refers to collection of strings which are stored in heap memory"));
System.out.println(str.matches("java string pool refers to collection of strings which are stored in heap memory"));
System.out.println("*****************************************");
String str1=new String("java string pool refers to collection of strings which are stored in heap memory");
System.out.println(str.compareTo(str1));
System.out.println(str.compareToIgnoreCase(str1));
System.out.println(str1.contentEquals(str));
if (str==str1) {
	System.out.println("they are equal");
}
else {
	System.out.println("these are not equal");
}

	}

}
