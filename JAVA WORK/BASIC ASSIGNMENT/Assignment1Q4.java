/*
  Q4. Supply marks of three subject and declare the result, result declaration is based on below conditions:

              Condition 1: -All subjects marks is greater than 60 is Passed

              Condition 2: -Any two subjects marks are greater than 60 is Promoted

              Condition 3: -Any one subject mark is greater than 60 or all subjects� marks less than 60 is failed.
*/
import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    		if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
    		{
    			return "passed";
    		}
    		else if((subject1Marks>60 && subject2Marks>60) || (subject2Marks>60 && subject3Marks>60) || (subject3Marks>60 && subject1Marks>60))
    		{
    			return "promoted";
    		}
    	
    		else if ((subject1Marks>60) || (subject2Marks>60) || (subject3Marks>60) || (subject1Marks+subject2Marks+subject3Marks<60))
    		{
    			return "failed";
    		}
    		else {
    			return "Failed";
    		}
    }
}
public class Assignment1Q4{
    public static void main(String[] args) {
    	ResultDeclaration check=new ResultDeclaration();
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the subject1Marks: ");
    	double subject1Marks = sc.nextDouble();
    	System.out.print("Enter the subject2Marks: ");
    	double subject2Marks = sc.nextDouble();
    	System.out.print("Enter the subject3Marks: ");
    	double subject3Marks = sc.nextDouble();
    	sc.close();
    	
    	String result=check.declareResults(subject1Marks, subject2Marks, subject3Marks);
    	System.out.print(result);
    	
    }
}