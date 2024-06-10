
package Controller;
import Model.MemployeeRegister;


public class CemployeeRegister {
    public void Remployee(int Id,String Name,String Address,int Telephone,String Email,String Username,String Password)
    {
        MemployeeRegister mit=new MemployeeRegister();
        mit.Eregister(Id, Name, Address, Telephone, Email, Username, Password);
    }  
    
}
