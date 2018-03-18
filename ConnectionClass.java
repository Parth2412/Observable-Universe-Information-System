package OUIS;
import java.sql.*;
public class ConnectionClass {
    public java.sql.Connection cn;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement ps;
    
    public ConnectionClass()
    {
        try{
        
            Class.forName("org.postgresql.Driver");
            cn=DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","postgres", "admin");
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
