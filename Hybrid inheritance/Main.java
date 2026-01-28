
class Employee {
    
    public void work() {
        System.out.println("Employee of XYZ company");
    }
    
}


class Manager extends Employee{
    
    public void workManager() {
        System.out.println("He is manager");
    }
    
}


class AsstManager extends Employee{
    
    public void workAsstManager() {
        System.out.println("He need to submit to manager");
    }
    
}


class DeputyManager extends Employee{
    
    public void workDeptManager() {
        System.out.println("He need to submit to manager");
    }
    
}


public class Main
{
	public static void main(String[] args) {
	    
	    Manager obj = new Manager();
	    obj.workManager();
	    obj.work();
	   
	    AsstManager obj1 = new AsstManager();
	    obj1.workAsstManager();
	    obj.work();
	    
	    DeputyManager obj2 = new DeputyManager();
	    obj2.workDeptManager();
	    obj2.work();
	    
	}
}