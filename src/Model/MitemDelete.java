
package Model;
import java.sql.*;
import javax.swing.JOptionPane;


public class MitemDelete {
    public void deleteItem(String Id)
    {
         try{Statement st=Mdbconnection.getdbconnection().createStatement();
           int rc=st.executeUpdate("delete from items where Id='"+Id+"'");
           if(rc>0)
           {
               JOptionPane.showMessageDialog(null, "Item deleted");
           }
            
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
}
