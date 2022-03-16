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
public class PhoneNoException extends Exception
{
    public PhoneNoException()
    {
        super("Phone no. can not be more/less then 11 digit.");
    }
    public PhoneNoException(String msg)
    {
        super(msg);
    }
    
}