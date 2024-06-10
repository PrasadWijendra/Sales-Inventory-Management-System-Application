
package Controller;
import Model.Mitems;


public class Citems {
    public void Cadditems(String Id,String Name,String Category,Double Bprice,Double Sprice,int Quantity)
    {
        Mitems mit=new Mitems();
        mit.additems(Id, Name, Category, Bprice, Sprice, Quantity);
    }  
            
                          
            
    
}
