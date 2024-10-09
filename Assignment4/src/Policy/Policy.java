package Policy;

public interface Policy {
	
	double calSal(double salary);
	double calSal(double salary , double bonus);
	
	String displayName(String name);
	int displayId(int id);
	String displayAddr(String addr);


}
