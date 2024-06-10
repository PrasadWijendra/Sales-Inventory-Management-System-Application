
package Controller;
import Model.MitemDelete;


public class CitemDelete {
    public void CdeleteItem(String Id)
    {
        MitemDelete di=new MitemDelete();
        di.deleteItem(Id);
    }
    
}
