
class  Employee{
	
	String name="Tom";
	int id=10;
	String addr="South Carolina,Detroit";
	double salary=23000;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", addr=" + addr + ", salary=" + salary + "]";
	}
	
}

public class Main {
public static void main(String[] args) {
	
	Employee employee = new Employee();
	System.out.println(employee.toString());
	
}	
	
	 

}
