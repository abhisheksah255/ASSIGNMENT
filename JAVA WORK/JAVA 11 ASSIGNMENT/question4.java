/*
 Using features of Java 11, read the data from a text file (File name: StudentList.txt).
Calculate the count of students and print the names as well as the total count of
students on the screen. (If any line in file doesn’t contain a name, for such a record
blank space should not be printed in the output)
 */

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class question4 {

	public static void main(String[] args) {
		var path="C:\\Users\\DRAGO\\Downloads\\Java11Assignments_StudentList.txt";
		String data=null;	
		try {
				 data = Files.readString(Path.of(path));
				System.out.println(data);
				System.out.println("*****************************");
			
				List<String> list=data.lines().collect(Collectors.toList());
				int count=0;
				for (String value : list) {
					if(value.isBlank())
					{
						continue;
					}
					count++;
				}
				System.out.println("Total Number of students in the list are : "+count);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
		}


}
