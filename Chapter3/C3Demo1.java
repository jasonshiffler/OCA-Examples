/**
 * This file illustrates the following concepts from Chapter 3 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 * <p>
 * <p>
 * -Strings
 * <p>
 * <p>
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */


package Chapter3;

public class C3Demo1 {

    public static void main(String[] args) {
        stringDemo();
        stringMethods();
    }


    private static void stringDemo() {

        /** Strings are a special type object that can be created without the new operator
         If the new operator is used the String is not part of the String pool that collects
         all the strings for memory conservation
         */
        String s1 = "name";
        String s2 = new String("name");
        String s3 = "name";

        if (s1 == s3)
            System.out.println("s1 and s3 reference the same object");

        if (s1 != s2)
            System.out.println("s1 and s2 don't reference the same object");

        /**
         * String concatenation rules:
         * if both operands are numeric + means addition
         * if either operand is a String + means concatenation
         * the expression is evaluated left to right
         * */

        System.out.println(1 + 2 + "bc");
        System.out.println("bc" + 1 + 2);


        int three  = 3;
        String four = "4";
        System.out.println ( 1 + 2 + three + four);


        // Concatenation with the += operator
        String thing = "thing";
        thing += "2";  //same thing as thing = thing + 2;
        System.out.println(thing);


        //demonstrates the immutability of strings

        String s4 = "String concatenation ";
        s4 = s4.concat("Method");
        System.out.println (s4);
        s4.concat("Strings are immutable"); //returns a new but s4 still points to the old string
        System.out.println(s4);

    } //close method

    /**
     * Demos some of the more popular methods that get used with Strings     *
     * */

    private static void stringMethods(){

        String demo = " Demo String ";
        String demo2 = new String(" Demo String "); //create a unique String object


        System.out.println(demo);
        System.out.println(demo.length());    //returns String length
        System.out.println(demo.trim());      //returns a string with the leading and trailing whitespace trimmed
        System.out.println(demo.toUpperCase()); //returns an all upper case string
        System.out.println(demo.toLowerCase());  //returns an all lower case string
        System.out.println(demo.charAt(4));      //returns the charter at index 4 (numbering starts at 0)
        System.out.println(demo.indexOf("St"));  //returns the index of the first location where this string is found
        System.out.println(demo.indexOf('e'));  //returns index of the first location where this char is found
        System.out.println(demo.indexOf('x'));  //returns -1 since the char is not found
        System.out.println(demo.substring(4));   // returns the string starting at index 4 to the last char
        System.out.println(demo.substring(4,7)); // returns the string starting at index 4 up to , but not
                                                       // including the character at the 7th index
        System.out.println(demo.substring(4,4)); // Empty String
        //System.out.println(demo.substring(3,2)); // Throws Exception
        //System.out.println(demo.substring(3,100)); // Throws Exception, way beyond the bounds

        System.out.println("None of the methods have changed the original string " + demo);

        System.out.println(demo.equals(demo2)); //verifies if two strings contain the same characters
        System.out.println(demo.equalsIgnoreCase(demo2)); //verifies if two strings contain the same characters
        System.out.println(demo.startsWith(" Demo"));  //returns true if the string starts with a certain string
        System.out.println(demo.endsWith("ing ")); //returns true if the string ends with a certain string
        System.out.println(demo.contains("mo")); //returns true if the string contains a certain string
        System.out.println(demo.replace('m','x')); //replace one character with another in the String
                                                           //chars are case sensitive

        //methods can be chained together as long, evaluation is done left to right
        System.out.println(demo.toUpperCase().trim().replace('M','U')); 



    }//close method




} //close class
