
package Controller;
import Model.MemployeeLogin;
import java.sql.*;


public class CemployeeLogin {
     public ResultSet Emplogin(String Username)
    {
        MemployeeLogin el=new MemployeeLogin();
        return el.Elogin(Username);
    }
    
}
