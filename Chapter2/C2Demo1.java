/**
 * This file illustrates the following concepts from Chapter 1 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Increment/Decrement Operator
 * -Numeric Promotion
 * -Casting Primitive Values
 * -Compound assignment operator
 * -instanceof Operator
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

package Chapter2;

import java.util.ArrayList;

public class C2Demo1 {


    public static void main(String []args){

        incdecDemo();
        assignmentDemo();
        instanceofDemo();
    }
/**
 * This method shows the difference between pre and post increment/decrement operators
 *
 * */


    public static void incdecDemo() {
        int i = 0;

        System.out.println(++i );  //i is incremented and then the expression is evaluated, output is 1
        i = 0;
        System.out.println(i++ ); //The expression is evaluated, and then i is evaluated, output is 0

        i = 1;
        System.out.println(--i );  //i is decremented and then the expression is evaluated, output is 0
        i = 1;


        int x = 3;

        /**
        This is a little tricky, the value of x changes each time it is modified as the expression moves from left
        to right. Don't do this in real life!
          y = 4 * 5 / x-- + --x; x= 4
         y = 20/4 + --x; x = 3
         y = 5 + 2; x = 2
         y==7,x==2
        */

        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }
/**
 * Shows simple assignment. Java will convert promote from smaller to larger data types but not larger to smaller
 * Also demonstrates casting and number overflow
 * */
    public static void assignmentDemo(){

        //int x1 = 1.0;          //1.0 is a double, not an int
        //float x2 = 1.0;        //1.0 is a double not a float, the compiler won't demote the double to a float
        float x3 = 1.0f;
        float x4 = (float)1.0;   //we can cast the double as a float to make it work

        //byte b1 = 128;     //This number is too big to fit into a byte
        byte b2 = 127;
        byte b3 = (byte) 128; //We can cast to make this work, since this number is too large for a byte it will
                              //wrap around to the next negative number

        byte b4 = (byte) -129; //Wraps around to the next positive number

        byte b5 = (byte)(b4 * b3);  //when a binary operator is applied to a byte, short or char they are
                                    //automatically promoted to an int type we can cast to retain the the type.


        System.out.println("The value b3 is wrapped to " + b3);
        System.out.println("The value b4 is wrapped to " + b4);

        //long L = 100_000_000_000;  //100_000_000_000 is treated as an int but it is too big
        long L = 100_000_000_000L; //The L tells the compiler to treat the literal as a long instead of an int.


        long w1 = 10;
        int w2 = 5;
        //w2 = w1 * w2;  //Doesn't compile since w2 is an int and w1 * w2 is a long
        w2 *= w1;        //This works since the compiler will auto cast w1 * w2 back to an int


    }//close method

    /**
     * instanceof is a binary operator that can be used to verify the class of an Object
     *
     * */

    public static void instanceofDemo() {

        ArrayList a = new ArrayList();

        if (a instanceof ArrayList)
            System.out.println("a is an ArrayList");






    }






}
