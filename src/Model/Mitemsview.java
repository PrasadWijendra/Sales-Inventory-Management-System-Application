
package Model;
import java.sql.*;


public class Mitemsview {
     ResultSet rst;
    public ResultSet viewitem()
    {
        try{
            Statement st=Mdbconnection.getdbconnection().createStatement();
            rst=st.executeQuery("select *from items");
            
        }
        catch(SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
        return rst;
    }

   
    
}
