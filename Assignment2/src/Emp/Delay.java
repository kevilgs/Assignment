package Emp;

public class Delay extends Emp{
	
	@Override
	public String display(String msg) {
		msg="Salary will be delayed";
		return super.display(msg);
	}
}