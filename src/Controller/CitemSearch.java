
package Controller;
import Model.MitemSearch;
import java.sql.*;


public class CitemSearch {
    public ResultSet CsearchItem(String Id)
    {
        MitemSearch is=new MitemSearch();
        return is.Searchitem(Id);
    }
    
}
