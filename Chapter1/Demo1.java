/**
 * This file illustrates the following concepts from Chapter 1 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Instantiating objects
 * -Working with constructors
 * -Variable Declaration Rules
 * -Instance Initializer Blocks
 * -Numeric Literals
 * -Comments
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */


//import java.util.Date; //imports must be between any package declarations and before first class definition

package Chapter1;

/*Initializer blocks must be within the
class to work. Example of a multiline comment*/
//Example of a single line comment

//{System.out.println("Fail");}
//static { System.out.println("Fail");}

import java.util.Date; //imports come between any package declarations and the first class
//import java.util.date; //Java is case sensitive! The d in Date must be capitalized

//import java.sql.Date; //Can't use Date from two packages!

public class Demo1 {

    //import java.util.Date; //Too late!



    /***********We're showing initialization order here********************/


    static {
        System.out.print("Hello");  //Static Initialization happens on class instantiation
    }

    int num = 1; //Variables must begin with a letter, $ or _ and may contain numbers

    {
        System.out.print("World" + num); //Instance initializer and won't run until a Demo1 object is
        //created. Runs before the constructor.
    }

    //int num = 1; //instance variables and initialization blocks are evaluated in the order they appear in the
    //.java file. uncomment me and comment out the previous num to see the compiler fail



    /**
     * I'm a no argument constructor
     * I run after the instance is initialized
     */
    Demo1() {
        System.out.println("!");
    }

/**
 * Finalize is an overriden method from class Object that runs IF the object is collected for garbage.
 * It must be protected since the inherited Object method is protected. More details in another demo.
 */

    protected void finalize(){

        System.out.println("Maybe I'll run, maybe I won't");

    }


    public static void main(String[] args) {
        System.out.print(",");
        Demo1 demo = new Demo1(); // Create a reference var of type Demo1 called demo and point the reference
                                  // to a new Demo1 object.
        demo = null;              //demo is de-referenced and is now eligible for garbage collection.

    }//close method

}//close class

//import java.util.Date; //Too late!