package day58_exceptions.bank;

import day57_exceptions.webelement.Input;

public class InvalidCredentialsException extends Exception{
    // this is a checked exception now the parent is the Exception class
    public InvalidCredentialsException(String msg){
    super(msg);
    }
}
