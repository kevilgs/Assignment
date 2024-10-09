package Acc;

import PolicyImp.PolicyImp;
public class Acc extends PolicyImp {
	
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
	
	@Override
	public String displayName(String name) {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public int displayId(int id) {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public String displayAddr(String addr) {
		// TODO Auto-generated method stub
		return addr;
	}

}
