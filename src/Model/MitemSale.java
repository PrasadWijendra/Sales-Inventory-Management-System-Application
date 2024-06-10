
package Model;
import java.sql.*;
import javax.swing.JOptionPane;


public class MitemSale {
     public void saleItems(String Id,String Name,Double	Unitprice,int Quantity,Double Totalprice,int Cash,Double Balance)
    {
        try{Statement st=Mdbconnection.getdbconnection().createStatement();
           int rc=st.executeUpdate("insert into sales values('"+Id+"','"+Name+"','"+Unitprice+"','"+Quantity+"','"+Totalprice+"','"+Cash+"','"+Balance+"')");
           if(rc>0)
           {
               JOptionPane.showMessageDialog(null, "Item Sales successfull");
           }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Database connection error");
        }
       
    }
    
    
}
