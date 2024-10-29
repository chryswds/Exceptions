package org.example;

public class NegativeNumberException extends ArithmeticException {

//    Call on the negative number exception
//    Non-parametised method
    public NegativeNumberException() {
        super();
    }

//    Parametised Exception
    public NegativeNumberException(String message) {
        super(message);
    }

}
