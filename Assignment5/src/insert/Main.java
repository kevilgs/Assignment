package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
public static void main(String[] args) throws Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
    
    
    PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?,?)");
    
    preparedStatement.setInt(1, 04);
    preparedStatement.setString(2, "Akash");
    
    preparedStatement.execute();
    System.out.println("inserted");
    connection.close();
    
	
}
}
