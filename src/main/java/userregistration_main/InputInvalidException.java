package userregistration_main;

/**
 *  We have created this class to create a Custom Exception. 
 *  We have used Inheritance and extended the Exception class.
 *  Then we have created a method and passed a message as input.
 *  Inside the method we have called the super. It is a reference variable which is used to refer immediate parent class object. 
 **/
public class InputInvalidException extends Exception {
	
	public InputInvalidException(String message) {
        super(message);
    }

}
