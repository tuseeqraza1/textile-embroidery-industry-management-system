/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author tusee
 */
public class SalaryException extends Exception
{
    public SalaryException()
    {
        super("Salary can not be negative.");
    }
    public SalaryException(String msg)
    {
        super(msg);
    }
    
}