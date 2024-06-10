
package Model;
import java.sql.*;
import javax.swing.JOptionPane;



public class MemployeeRegister {
     public void Eregister(int Id,String Name,String Address,int Telephone,String Email,String Username,String Password)
    {
        try{Statement st=Mdbconnection.getdbconnection().createStatement();
           int rc=st.executeUpdate("insert into register values('"+Id+"','"+Name+"','"+Address+"','"+Telephone+"','"+Email+"','"+Username+"','"+Password+"')");
           if(rc>0)
           {
               JOptionPane.showMessageDialog(null, "Employee register successfull");
           }
            
        }
        catch(SQLException e)
        {
             System.err.println(e.getMessage());
        }
       
    }
    
}
