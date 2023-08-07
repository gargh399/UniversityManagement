package management;
import java.sql.*;

public class conn{
	
	Connection c;
	Statement s;
	conn(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","Gargh399@");
			s=c.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

	
	
