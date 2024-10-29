package org.example;

public class Circle {

//    The circle must have a radius
//    We need to validate the inputs to be within our
//    Specific radius value
//    The minimum value should be bigger than 0

//    Construct the attributes

    int radius;

//    Constructor to assign or retrieve the value

    public Circle(int radius) throws ZeroLengthException {
//        The condition to test four our exception
        if(radius == 0){
//            if it's 0 throw an exception message
            throw new ZeroLengthException();
        }else if( radius <  0){
            throw new NegativeNumberException("Radius cannot be negative");
        }else {
//            Assign the radius value
            this.radius = radius;
        }
    }



}
