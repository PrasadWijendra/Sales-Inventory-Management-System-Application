
package Model;
import java.sql.*;
public class Mdbconnection {
  private static Connection con;
  public static Connection getdbconnection()
  {
      try{
          String dbp="jdbc:mysql://localhost/auto";
          con=DriverManager.getConnection(dbp,"root","");
         }
      catch(SQLException e)
      {
          System.err.println(e.getMessage());
      }
      return con;
  }
}
