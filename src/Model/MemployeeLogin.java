
package Model;

import java.sql.*;




public class MemployeeLogin {
     ResultSet rst;
    public ResultSet Elogin(String Username)
    {
        try{
            Statement st=Mdbconnection.getdbconnection().createStatement();
            rst=st.executeQuery("select * from register where Username='"+Username+"'");
            
        }
        catch(SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
        return rst;
    }
    
}
