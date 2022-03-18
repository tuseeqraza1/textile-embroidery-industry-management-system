package CustomerManagement;

import java.io.Serializable;
import oop_project.*;

public class Bill implements Serializable 
{
    private Date1 date;
    private Product product;
    private int quantity;
    private Integer billNo;
    private double totalBill;
    
    public Bill()
    {
        date = new Date1();
        product = new Product();
        quantity = 1;
        billNo = 1;
        totalBill = product.getPrice() * quantity;
    }
    
    public Bill(Date1 date, Product product, int quantity, int bill_no)
    {
        this.billNo = bill_no;
        this.date = date;
        this.product = product;
        this.quantity = quantity;
        this.totalBill = this.product.getPrice() * this.quantity;
    }

    public Date1 getDate() {
        return date;
    }

    public void setDate(Date1 date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getBillNo() {
        return billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }    
}
