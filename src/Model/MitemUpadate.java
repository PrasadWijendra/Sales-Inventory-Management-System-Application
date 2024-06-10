
package Model;
import java.sql.*;
import javax.swing.JOptionPane;


public class MitemUpadate {
    public void updateItem(String Id,String Name,String Category,
            Double Bprice,Double Sprice,int Quantity)
    {
         try{Statement st=Mdbconnection.getdbconnection().createStatement();
           int rc=st.executeUpdate("update items set Name='"+Name+"',Category='"
                   +Category+"',Bprice='"+Bprice+"',Sprice='"+Sprice+"',Quantity='"
                   +Quantity+"' where Id='"+Id+"'");
           if(rc>0)
           {
               JOptionPane.showMessageDialog(null, "Item Update successfull");
           }
            
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    
    
}
