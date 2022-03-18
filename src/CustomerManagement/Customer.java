package CustomerManagement;

import java.io.Serializable;
import oop_project.Address;

public class Customer extends Industry implements Serializable
{
    private int customerID;
    
    public Customer()
    {
        super();
        customerID = 1;
    }
    
    public Customer(String name, String phone, String cnic, String gender, String industryName, Address address, int customerID, Bill bills, Receive payments)
    {
        super(name, phone, cnic, gender, industryName, address, bills, payments);
        this.customerID = customerID;
    }
    
    public Customer(String name, String phone, String cnic, String industryName, Address address, int customerID)
    {
        super(name, phone, cnic, industryName, address);
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }  
}
