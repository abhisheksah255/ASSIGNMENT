/*
 1)	Given a TreeMap<Long, Contact> which has phone numbers for keys and contact objects for values.

Write solutions to 
a.	Fetch all the keys and print them, 
b.	Fetch all the values and print them
c.	Print all key-value pairs
Note: 
a)	Contacts should be stored in descending order of phone number
b)	Contact Class:
•	PhoneNumer: <long>
•	Name: <String>
•	Email: <String>
•	Gender: <Enum>

	*/

import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
import java.lang.Error;

enum gender{Male,Female}
	
class Contact implements Comparable<Contact>{
		long PhoneNumber;
		String Name;
		String Email;
		gender g;
		public Contact( String name, String email, gender g) {
			super();
			Name = name;
			Email = email;
			this.g = g;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public gender getG() {
			return g;
		}
		public void setG(gender g) {
			this.g = g;
		}
		
		@Override
		public String toString() {
			return " [ Name=" + Name + ", Email=" + Email + ", g=" + g + "]";
		}
		public int  comparator(Contact c1,Contact c2) {
			return 1;
		}
	
	}

	public class Question1 {
		
		public static void main(String[] args) throws Exception{
			TreeMap<Long,Contact> data=new TreeMap<Long,Contact>();
			data.put((long) 878989781,new Contact("Abhishek","Abhishek@gmail.com",gender.Male));
			data.put((long)871678965,new Contact( "Chandni", "Chandni@gmail.com",gender.Female));
			data.put((long)768236578,new Contact("Dhiru", "Dhiru@gmail.com",gender.Male));
			data.put((long)912879876,new Contact("Purnima", "Purnima@gmail.com",gender.Female));
			data.put((long)801786567,new Contact("Komal", "Komal@gmail.com",gender.Female));
			data.put((long)998866775,new Contact("Ankit", "Ankit@gmail.com",gender.Male));
			
			for (Entry<Long, Contact> ab:data.entrySet()) {
			System.out.println("************Fatch all the key********************");
	           System.out.println("Key :- (" + ab.getKey()+ ")");
			}
			
			for (Entry<Long, Contact> ab:data.entrySet()) {
				System.out.println("************Fatch all the value********************");
		           System.out.println("Value :- (" + ab.getValue()+ ")");
			}
			for (Entry<Long, Contact> ab:data.entrySet()) {
		           System.out.println("**********************key and Value Pair of Contact***********************");
						System.out.println("Contact Detail :-"+"Key :-" + ab.getKey() +" Value :- "+ ab.getValue());
			}
	           
			}
			
		    }

	    

