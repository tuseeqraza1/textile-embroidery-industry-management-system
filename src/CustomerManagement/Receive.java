
package CustomerManagement;

import java.io.Serializable;
import java.util.ArrayList;
import oop_project.Date1;

public class Receive implements Serializable 
{
    private Date1 date;
    private Double amount;
    
    public Receive()
    {
        date = new Date1();
        amount = 0.0;
    }
    
    public Receive(Date1 date, double amount)
    {
        this.date = date;
        this.amount = amount;
    }

    public Date1 getDate() {
        return date;
    }

    public void setDate(Date1 date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    } 
}
