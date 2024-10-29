package org.example;

public class ZeroLengthException extends InvalidLengthException{

//    This will handle the length = 0 exception

    public ZeroLengthException() {
        //We can still print out hardcoded exceptions
        //Without passing in the input
        super("The Length of a shape cannot be 0");
    }

    public ZeroLengthException(String message) {
        super(message);
    }
}
