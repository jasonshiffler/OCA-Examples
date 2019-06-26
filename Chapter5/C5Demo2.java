
/**
 * This file illustrates the following concepts from Chapter 5 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 *
 * -Overriding Methods
 * 
 *
 * Rules of Overriding Methods
 *
 * -Method in the child class must have the same signature as the method in the parent class
 *
 * -Method in the child class must be at least as accessible or more accessible than the method in the parent class
 *
 * -Method in the child class may not throw a checked exception that is broader than the class of any exception
 * thrown in the parent class method
 *
 * -If a method returns a value it must be the same or the subclass of the the method in the parent class. (Covariant)
 *
 * Hidden method rules are the same with the exception that a method must be marked static in both the class and subclass
 *
 *
 */


package Chapter5;

import java.io.IOException;

public class C5Demo2 {

    class Fish {

        String getNumberOfFins() throws IOException {
            return "Undefined";

        } //close method

        private String getNumberOfTeeth() throws IOException {
            return "Undefined";
        }

         final String getNumberOfBones(){
             return "200";

        }//close method

    } //close class

    class Shark extends Fish {


        String getNumberOfFins(){return "3";} //Doesn't have to throw an Exception

        //Must return the same type or a subclass as the overriden method

        //int getNumberOfFins(){return "3";}

        //Must be at least as accessible or more accessible than the method in the parent class

        //private String getNumberOfFins(){return "3";}

        //Can't throw a more general Exception than the overriden method

        //String getNumberOfFins() throws Exception{ return "3";}


        //Redeclaration of a private method. We aren't overloading since the parent class method is private
        int getNumberOfTeeth() throws Exception{return 1;}


        //Parent method is marked final so overriding is not permitted.
        //String getNumberOfBones(){return "300";}
    }


}
