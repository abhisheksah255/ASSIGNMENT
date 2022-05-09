/*
 4)	Given a LinkedList of Objects representing date of birth’s (use any inbuild java class to represent date), print the date’s along with the message: Your date of Birth is DD-MM-YYYY, and it (was or was not) a leap year.
E.g.
a)     For the date 23-12-2000 
Your date of birth is 23-12-2000 and it was a leap year
c)	For the date 23-12-2001

Your date of birth is 23-12-2000 and it was not a leap year
	
	Note: You need to access the Dates in the reverse order. I.e. start from the last object and move towards the first object
*/
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

public class Question4 {

	public static void main(String[] args) {
		System.out.println("*****Program to check that year is leap year or not************");
	
		LinkedList<LocalDate> data=new LinkedList<>();
		data.add(LocalDate.parse("2000-04-21"));
		data.add(LocalDate.parse("2001-01-22"));
		data.add(LocalDate.parse("2021-01-10"));
		data.add(LocalDate.parse("2003-02-02"));
		data.add(LocalDate.parse("2008-05-03"));
	
			Iterator<LocalDate> date =data.iterator();
			while(date.hasNext())
			{
				LocalDate localdate=date.next();
				System.out.println("This is the date :-"+localdate);
				boolean value=localdate.isLeapYear();
				if(value)
				{
					System.out.println("Your date of birth is "+localdate+ " and it was a leap year");
				}
				else
				{
				
				 System.out.println("Your date of birth is "+localdate+" and it was not a leap year");
				}
			}
		}
	}
