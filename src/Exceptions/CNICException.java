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
public class CNICException extends Exception
{
    public CNICException()
    {
        super("CNIC can not be more/less then 13 digit.");
    }
    public CNICException(String msg)
    {
        super(msg);
    }
    
}