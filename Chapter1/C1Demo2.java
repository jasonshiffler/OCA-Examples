/**
 * This file illustrates the following concepts from Chapter 1 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Variable Declaration Rules
 * -Numeric Literals
 * -Using Packages and dealing with naming conflicts
 * -Local Variable Scope
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

//import java.util.Date; //imports must be between any package declarations and before first class definition

package Chapter1;

import java.util.Date;    //Imports must come after package declarations. Imports Date class within java.util package
import java.util.*;       //This statement includes all classes within the java.util package
                          //This import is redundant since we only need data and have already imported that class



//int wrong1; //Variable declarations must be within a class

public class C1Demo2 {      //Class declarations must come after the imports

    //import java.util.Date; // must be between package and class!


    int num1$_;    //We can use numbers in the variable name as long as the variable
                   //begins with a letter or underscore

    //int 1num;    //Variables can contain numbers but can't begin with them.

    //int num&&;     //No special characters are allowed besides $ or _

    int _$$num = 0, num2 = 0; //This is ok, we can declare multiple vars on the same line.

    //int num3, String string; //But they must be the same type.

    //int num4, int num5; //Can't repeat the type declaration, even if they are of the same type.

    int million = 1_000_000; // Numeric literals are optional and help big numbers to be more readable.

    //float hundredThou = _100_000_._00_f; //Can't put numeric literals before or after the decimal point
                                           //and can't be at the beginning or end for the literal

    //int num6 = null; //int is a primitive type and can't point to null;

    Integer num7 = null; //Integer is a reference type and can point to null

    Date today;          //using the java.util.Date import

    java.sql.Date sDate; //If we need to use two Date objects we can use the full class name.


    /**************The 8 primitive types plus a reference type********************/

    byte byte1;
    short short1;
    int int1;
    long long1;
    float float1;
    double double1;
    char char1;
    boolean boolean1;
    //boolean true; //true is a reserved word and can't be used for a variable name

    Object obj1;

    int octal = 045;      //numeric literals can be represented in Octal
    int littleHex = 0xaa; //hex
    int bigHex = 0xAA;
    int littleBi = 0b1101; //and binary
    int bigBi = 0B1101;   //when printed they will show up as a decimal number by default.


    public static void main(String [] args){
        C1Demo2 d2 = new C1Demo2();

        /**Instance variables are implicitly initialized */

        System.out.println("Instances variables that are byte are initialized to " + d2.byte1);
        System.out.println("Instances variables that are short are initialized to " + d2.short1);
        System.out.println("Instances variables that are int are initialized to " + d2.int1);
        System.out.println("Instances variables that are long are initialized to " + d2.long1);
        System.out.println("Instances variables that are float are initialized to " + d2.float1);
        System.out.println("Instances variables that are double are initialized to " + d2.double1);
        System.out.println("Instances variables that are char are initialized to " + d2.char1);
        System.out.println("Instances variables that are boolean are initialized to " + d2.boolean1);

        //This does not have an exception and outputs the string null.
        System.out.println("Instances variables that are reference types are initialized to " + d2.obj1);

        { //code block all variables within this block are out of scope at the end of block
            int i;
            i = 0; //Local variables must be initialized before being used comment out this line to see
            System.out.println("I is in scope and is set to " + i);
            {
                System.out.println("I is still in scope and is set to " + i);  // Still in scope since the {} is
            }                                                                  // within the outer {}

        }

        // System.out.println("I is out of scope " + i); // I has gone out of scope and can't be referenced

    } //close method

} //close class

//import java.util.Date; //Too Late!