/**
 * This file illustrates the following concepts from Chapter 1 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Variable Declaration Rules
 * -Numeric Literals
 * -Using Packages and dealing with naming conflicts
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

//import java.util.Date; //imports must be between any package declarations and before first class definition

package Chapter1;

import java.util.Date;

public class Demo2 {

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




}

//import java.util.Date; //Too Late!