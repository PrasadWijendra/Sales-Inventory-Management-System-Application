
package Controller;
import Model.MitemSale;


public class CitemSales {
     public void CsaleItems(String Id,String Name,Double Unitprice,int Quantity,Double Totalprice,int Cash,Double Balance)
    {
        MitemSale mit=new MitemSale();
        mit.saleItems(Id, Name, Unitprice, Quantity, Totalprice, Cash, Balance);
    }  
    
}
