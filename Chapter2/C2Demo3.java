/**
 * This file illustrates the following concepts from Chapter 2 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *  -switch statement
 *  -while loops
 *  -for-each iteration
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

package Chapter2;

import java.util.ArrayList;

public class C2Demo3 {


    public static void main(String args[]) {
        switchDemo();
        whileDemo();
        forEachDemo();
    }

    /**
     * This demo shows how the switch statement works
     * The test variable can be a byte, Byte, short, Short, char, Char,
     * int,Integer, String, or enum
     *
     * */

    private static void switchDemo() {

        int x = 5;

        switch (x) {
            default:
                System.out.println("The default statement is optional can be anywhere in the case ");
                System.out.println("statement and runs if no match is found ");
            case 1:
                System.out.println("x is 1");
                break;
            case 5:
                System.out.println("x is 5");
                break;
        }//close case


        String y = "Five";
        switch (y) {
            case "One":
                System.out.println("y is One");
            case "Five":
                System.out.println("y is Five");
            case "Six":
                System.out.println("With no break all statements after matching case are run");
            default:
                System.out.println("Default runs if it is placed after a matching statement with no breaks");
                System.out.println("Multiple execution steps are fine within a case statement");
        }//close case


    }//close method

/**
 * This demo shows how the do while and while loops work
 * the block within do-while is always run at least once
 *
 * */

    private static void whileDemo(){

        int x = 0;

        while (x < 5) {
            x++;
            System.out.println("x is now " + x);
        }

        x = 0;

        //While statements don't need {} if they fit in one line
        while (x < 5)
            System.out.println("x is now " + x++);

        //Beware the infinite loop!
      /*
        while (x < 5){
            System.out.println("x is now " + x );
        }
        */

        x = 1;

        do {
            System.out.println("code in a do-while block runs at least once");

        } while(x !=1); //Note the ; required at the end of the do while statement.


    } //close method


    /**
     * Demonstrates the for-each loop in Java works for any built in Java Array or class that implements iterable
     * such as an ArrayList. ArrayLists are covered in more detail in Chapter 3
     * */

    private static void forEachDemo(){

        ArrayList<String> aList = new ArrayList<String>();

        aList.add("Hello");
        aList.add(",");
        aList.add(" ");
        aList.add("World");
        aList.add("!");

        for(String s : aList)      //work through each item in the list assign the variable s to the value
            System.out.print(s);   //that is available

        System.out.println("");

      //  for(int i : aList)      //The type of i doesn't match what's in the ArrayList!
        //    System.out.print(s);


        //names does not implement iterable!
        /*
       String names = "Jason";
       for (String name: names)
           System.out.print(name);
        */




    }



}//close class
