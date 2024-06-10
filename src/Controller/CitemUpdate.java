
package Controller;
import Model.MitemUpadate;


public class CitemUpdate {
    public void CupdateItem(String Id,String Name,String Category,
            Double Bprice,Double Sprice,int Quantity)
    {
        MitemUpadate ui=new MitemUpadate();
        ui.updateItem(Id, Name, Category, Bprice, Sprice, Quantity);
    }
    
}
