import java.util.ArrayList;

/*
 Write a program that describes the hierarchy of an organization. Here we need to write 3 classes Employee, Manager & Labour where Manager & Labour are the sub classes of the Employee. Manager has incentive & Labour has over time. Add the functionality to calculate total salary of all the employees. Use polymorphism i.e. method overriding.      
 
   */

class Manager extends Assignment2Q2 {
    public int getSalary(int salary) {
        int incentive = 5000;
        salary = salary + incentive;
		System.out.println("Salary of Manager:-");	
        return salary;
    }
}

class Labour extends Assignment2Q2 {
    public int getSalary(int salary) {
        int overtime = 500;
        salary = salary + overtime;
        System.out.println("Salary of Labour:-");
        return salary;
    }
}
public class Assignment2Q2 {
	static int salary = 10000;
	
    public int getSalary(int salary){
    	return salary;
    }
    
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int TotalSalary = 0;
    	for(int i: employeeSalaries) {
    		System.out.println(i);
    		TotalSalary = TotalSalary + i;
    	}
    	System.out.println("Total Employees Salary will be :- "+ TotalSalary);
    	return TotalSalary;
    }
	
	public static void main(String[] args) {
		Assignment2Q2 managerclass = new Manager();
	
		Assignment2Q2 labourclass = new Labour();
		
		ArrayList<Integer> Rupees = new ArrayList<>();
		Rupees.add(managerclass.getSalary(salary));
		Rupees.add(labourclass.getSalary(salary));
		totalEmployeesSalary(Rupees);
		
	}

}

