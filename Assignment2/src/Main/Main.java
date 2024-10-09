package Main;

import Emp.*;
public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		System.out.println("The salary : "+ emp.calSal(24000));
		System.out.println("Total salary including bonus:"+ emp.calSal(24000, 1300));
		
		System.out.println(emp.display("Salary will be delayed"));
		

	}

}
