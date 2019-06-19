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

package Chapter1;  // Package declarations must be first if it is present

/*Initializer blocks must be within the class to work!*/

//{System.out.println("Fail");}
//static { System.out.println("Fail");}


public class C1Demo1 {


    /***********We're showing initialization order here********************/


    static {
        System.out.print("Hello");  //Static Initialization happens on class instantiation
    }

    int num = 1;                    //Variables must begin with a letter, $ or _ and may contain numbers

    {
        System.out.print("World" + num); //Instance initializer happens on object creation Runs before the constructor.
    }

    //int num = 1; //instance variables and initialization blocks are evaluated in the order they appear in the
                   //.java file. uncomment me and comment out the previous num to see the compiler fail


    /**
     * I'm a no argument constructor
     * I run after the instance is initialized
     */
    C1Demo1() {
        System.out.println("!");
    } //close method


    /**
     * Even though the method name matches the class name this is not a constructor since
     * there is a return type in the method declaration.
     * */
    public void Demo1(){
        System.out.println("I'm not a constructor");
    }

/**
 * Finalize is an overriden method from class Object that runs IF the object is collected for garbage.
 * It must be protected since the inherited Object method is protected. More details in another demo.
 */

    protected void finalize(){
        System.out.println("Maybe I'll run, maybe I won't");
    } //close method


    public static void main(String[] args) {
        System.out.print(",");
        C1Demo1 demo = new C1Demo1(); // Create a reference var of type Demo1 called demo and point the reference
                                  // to a new Demo1 object.

        demo.Demo1();

        demo = null;              //demo is de-referenced and is now eligible for garbage collection.

        //demo.Demo1();           //This will generate an exception since demo no longer references an object

    }//close method

}//close class

//import java.util.Date; //Too late!