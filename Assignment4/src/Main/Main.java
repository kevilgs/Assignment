package Main;

import Emp.Emp;

public class Main {
public static void main(String[] args) {
	
	Emp emp = new  Emp();
	System.out.println("The salary of the employee:Rs"+emp.calSal(2500));
	System.out.println("The name of the employe:"+emp.displayName("Tom"));
	System.out.println("The id of the employee:"+ emp.displayId(11));
	System.out.println("The address of the employee:"+emp.displayAddr("Southern City,Detorit"));
	
	
	
	
	
	
}
}
