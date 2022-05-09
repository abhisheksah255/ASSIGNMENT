/*
 2) Carrying forward with the above problem, handle ArithmeticException by raising
UnsupportedOperationException as a solution.
 */
import java.util.Arrays;
import java.util.List;

public class ExceptionAssignment2 {

	public static void main(String[] args) {
		try {
			String []str= {"Abhi","Bittu","Ram"};
		List<String> x=Arrays.asList(str);
		System.out.println("The string list value is"+str);
		x.remove("Bittu");
		x.add("Mohan");
		}catch(UnsupportedOperationException ex) {
			System.out.println("new exception occur UnsupportedOperationException as a solution:"+ex);
		}
System.out.println("Code run successfully ");
	}

}
