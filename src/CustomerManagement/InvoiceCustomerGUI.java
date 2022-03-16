/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tusee
 */
class InvoiceCustomerGUI extends JFrame
{
    JTextField id,t1,t2,t3,t6,t7,t8,t9,bill_ID;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,search,title,background;
    JButton b1,b2,b3,b4,b5,b6;
    JPanel p1;
    JDateChooser date;
    JComboBox cb;
    String cName;
    double balance,t;
    int check,check2,bill_no;
    
    public InvoiceCustomerGUI()
    {
        
    }
}
