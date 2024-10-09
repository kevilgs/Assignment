package Emp;

import PolicyImp.PolicyImp;

public class Emp extends PolicyImp{
	
	@Override
	public double calSal(double salary) {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public double calSal(double salary, double bonus) {
		// TODO Auto-generated method stub
		return salary+bonus;
	}
	
	public String display(String msg) {
		
		return msg;
	}
	
	

}



