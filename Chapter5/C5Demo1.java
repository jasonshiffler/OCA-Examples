/**
 * This file illustrates the following concepts from Chapter 5 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 *
 * -Inheritance
 * -super()
 * -super
 *
 *
 * Constructor Rules
 *
 * -First statement in every constructor is a call using this or a call to a constructor in the parent class using
 * super.
 *
 * -super() may not be used after the first statement of the constructor
 *
 * -if super() isn't declared java will insert a no argument super() as the first statement in the constructor
 *
 * -if the parent doesn't have a no argument constructor and the child doesn't define a constructor the compiler
 * will throw an error and try to insert a default no-arg constructor in the calss
 *
 * -if the parent doesn't have a no arg constructor the child class requires an explicit call to a parent constructor in
 * each child constructor
 *
 *
 */


package Chapter5;

public class C5Demo1 {       //This class is public and can be accessed from anywhere


    public static void main(String args[]){

        C5Demo1 demo = new C5Demo1();
        demo.go();

    }//close method

    void go(){

        motorcycle moto = new motorcycle();
        car car1 = new car();


    } //close method



    class vehicle {        //This class is package private and can only be accessed from within the same package

        int wheels = 4;


        vehicle() {

            System.out.println("I'm, a vehicle");

        }//close constructor

    } //close class


    // The extends keyword makes Car a subclass of vehicle and is able to use both public and protected members

    class car extends vehicle{

        car(){
            super(); //refers to the parent class constructor
            System.out.println("A car has " + wheels + " wheels");
            //super(); //Just like this, super must be the first line in a constructor

        }//close constructor


    }// close class

    class motorcycle extends vehicle{

        public int wheels = 2;

        motorcycle(){
            //a call to super() is inserted here by the compiler
            //if there isn't a no arg constructor we must call the right super or create one

            System.out.println("A motorcycle has " + wheels + " wheels");

            System.out.println(super.wheels); // here super is used to access the parent member

        } //close constructor


    } //close class



} //close class

