/**
 * This file illustrates the following concepts from Chapter 1 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Comments
 * -Instance Initializer Blocks
 * -Instantiating objects
 * -Working with constructors *
 * -finalize()
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

//Example of a single line comment
/*
Example of a multiline comment, comments can go anywhere in the file
 */

package Chapter1;

/*Initializer blocks must be within the class to work!*/

//{System.out.println("Fail");}
//static { System.out.println("Fail");}


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
    } //close method

/**
 * Finalize is an overriden method from class Object that runs IF the object is collected for garbage.
 * It must be protected since the inherited Object method is protected. More details in another demo.
 */

    protected void finalize(){
        System.out.println("Maybe I'll run, maybe I won't");
    } //close method


    public static void main(String[] args) {
        System.out.print(",");
        Demo1 demo = new Demo1(); // Create a reference var of type Demo1 called demo and point the reference
                                  // to a new Demo1 object.
        demo = null;              //demo is de-referenced and is now eligible for garbage collection.

    }//close method

}//close class

//import java.util.Date; //Too late!