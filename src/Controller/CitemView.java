
package Controller;
import Model.Mitemsview;

import java.sql.*;


public class CitemView {
    public ResultSet CviewItem()
    {
        Mitemsview iv=new Mitemsview();
        return iv.viewitem();
    }

   
    
    
}
