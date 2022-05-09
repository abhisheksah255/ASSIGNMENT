/*
  1) Write an application to determine the length of 
  the String str = “Hello World”. (Hint: Use String method)
  
  2) Write an application to join the two Strings “Hello, ” & “How are you?”
   (Hint: Use String method)

 */
public class StringClass {
public void  question1(String str) { 
		System.out.println(str);
		System.out.println(str.length());
}
public void question2(String str1,String str2) {
	System.out.println(str1+str2);
	System.out.println(str1);
}
	public static void main(String[] args) {
		StringClass first=new StringClass();
		first.question1("Hello World");
		first.question2("Hello,", "How are you");
	}

}
