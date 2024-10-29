package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Taking the user input

        //once we have the user input
        //Validade user input


        Scanner myKB = new Scanner(System.in);

        boolean validInput = false;
        Circle circle1;
        // We need to take in the input for the circle

        int input = 0;



        // First block
        while(!validInput) {// Check user input and prompt over and over until we have a true value
            try {
                //Ask the user what you want to store
                System.out.println("What is the radius of the circle?");
                input = myKB.nextInt();
                circle1 = new Circle(input);
                validInput = true;
            }catch(InvalidLengthException e){
                System.out.println(e);
            }catch(NumberFormatException e){
                System.out.println(e);
            }
        }


        //Second block for rectangle

        Rectangle rec1 = new Rectangle(input, 6);

        // input = is a java runtime unchecked exception
        // Java will not tell us about this in advance
        // THe compiler must run to identify any issues with this input

        System.out.println("input from radius" + input);
        // THis is now a checked exception

        // We cannot compile the code even if it would not throw the exception

        System.out.println(8/input); // ArithmeticException possible divide by 0

        // Initialise the rectangle widths and pass in the value

        int [] numArray = {1,2,5,8,11,14};

        System.out.println("value at index " + input + " is " + numArray[input]); // check input value in the array

        //This block will handle exceptions from the input

        try{
            throw new Exception("This is a general exception");
        }catch(FileNotFoundException e){
            System.out.println("THe file is not found");
        }catch(Exception e){
            System.out.println("Exception print in the catch " + e);
            e.printStackTrace();//THis stack trace is a reference to when and where the event error occured
        }




    }
}