package org.example;

public class Rectangle {
    int length;
    int width;


//    The constructor will manage/validate the input value

    public Rectangle(int length, int width){
//        Check for the values and check if we need to throw any exceptions

        if( length <= 0 || width <= 0){
            throw new NegativeNumberException("The sides must be positive");
        }

//        Otherwise if the value is bigger than zero
        this.length = length;
        this.width = width;
    }


}
