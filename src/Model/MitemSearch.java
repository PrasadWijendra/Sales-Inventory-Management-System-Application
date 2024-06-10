
package Model;
import java.sql.*;

public class MitemSearch {
     ResultSet rst;
    public ResultSet Searchitem(String Id)
    {
        try{
            Statement st=Mdbconnection.getdbconnection().createStatement();
            rst=st.executeQuery("select Name,Sprice from items where Id='"+Id+"'");
            
        }
        catch(SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
        return rst;
    }
}
