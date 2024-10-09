package Emp;

import PolicyImp.PolicyImp;

public class Emp extends PolicyImp{
	
	@Override
	public double calSal(double salary) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calSal(double salary, double bonus) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String display(String msg) {
		
		return msg;
	}
	
	

}

class Delay extends Emp{
	
	public String display(String msg) {
		msg ="Salary wont be credited";      // overiding 
		return msg;
	}
}

