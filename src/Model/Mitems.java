
package Model;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Mitems {
    public void additems(String Id,String Name,String Category,Double Bprice,Double Sprice,int Quantity)
    {
        try{Statement st=Mdbconnection.getdbconnection().createStatement();
           int rc=st.executeUpdate("insert into items values('"+Id+"','"+Name+"','"+Category+"','"+Bprice+"','"+Sprice+"','"+Quantity+"')");
           if(rc>0)
           {
               JOptionPane.showMessageDialog(null, "Item add successfull");
           }
            
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
        /*catch(Exception ex)
        {
            System.out.println("please try again");
        }*/
    }
    
}
