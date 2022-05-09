import java.sql.ClientInfoStatus;

/*
  Write an abstract class ‘Persistence’ along with two sub classes ‘FilePersistence’ & ‘DatabasePersistence’.
   The base class with have an abstract method persist() which will be overridden by its sub classes.
    Write a client who gets the Persistence object at runtime & invokes persist() method on it without knowing whether data is being saved in File or in Database.
 */

abstract class Persistence {
    abstract public String persist() ;
}
class FilePersistence extends Persistence {
    @Override
    public String persist() {
    	System.out.println("File Persistence extends Persistence ");
    	System.out.println("File Persistence.");
    	return null;
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	System.out.println("DataPersistence extends Persistence");
    	System.out.println("Database Persistence.");
    	return null;
    }
}
public class Assignment2Q6 {

	public static void main(String[] args) {
		System.out.println("***************");
		Persistence FPersistence = new FilePersistence();
		Persistence DPersistence = new DatabasePersistence();		
			FPersistence.persist();
			System.out.println("*******************");
			DPersistence.persist();

	}

}