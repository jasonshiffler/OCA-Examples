/**
 * This file illustrates the following concepts from Chapter 2 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -for loops
 * -advanced loop control
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */


package Chapter2;

public class C2Demo4 {



    public static void main(String[] args){

        forDemo();
        advancedFlowControl();

    }

    /**
     * This method contains a demo of for loops.
     *
     * */

    private static void forDemo() {

        /** This compiles but creates an infinite loop
        for( ; ; ) {
            System.out.println("Infinite loop!");

        }
        */

        /** Need two ; to create three sections
         for(  ; ) {
         System.out.println("Doesn't compile!");

         }
         */

        int x = 0;

        //Multiple terms can be added to the for statement
        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println(y + " ");
        }

        /*This fails because x is being redeclared
        for (int x = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println(y + " ");
        }
        */

        int z = 0;
        //This is ok because we are reusing variables that have already been declared.
        //we can't reuse and declare variables in the same statement
        for (x = 0, z = 4; x < 5 && z < 10; x++, z++) {
            System.out.println(z + " ");
        }


        /** The variables in the initialization block must all be of the same type
        for (long a = 0, int b = 4; a < 5 && b < 10; x++, z++) {
            System.out.println(b + " ");
        }
        */

        //  both c and d are created and initialized
        // Loops can be labeled
        FORLOOP: for (int c = 0, d = 4; c < 5 && d < 10; c++, d++) {
            System.out.println(c + " ");
         }
        // System.out.println(c + " "); //c has now gone out of scope


    } //close method


    /**
     * Demonstrates some of the advanced things that can be done with loops
     *
     * */
    public static void advancedFlowControl(){


        //loop through a multiple dimensional array while adding labels

        int [][] array = { {1,2,3,4}, {6,7,8}, {9,10,11} };

        OUTER_LOOP: for (int [] simpleArray: array){

            INNER_LOOP: for (int i = 0; i < simpleArray.length; i++){
                            System.out.print(simpleArray[i] + " \t");
            }
                    System.out.println("");

        }


        // The break statement allows us to terminate the loop
        int x = 0;
        while ( x < 10){

            if (x == 7)
                break;
            x++;
        }
        System.out.println(x);


        //The continue statement transfer control back to the for statement
        for (int j = 0; j < 10; j++){

            if (j % 2 == 0)
                continue;
            System.out.println("J is always odd " + j);
        }

        System.out.println("Multiple loop demo");

        //Shows how break and continue can be use to jump to different loop statements

        int count = 0;
        outerloop: for (int m = 0; m < 3; m ++){

            middleloop: for (int n = 0; n < 3; n ++) {

                innerloop: for (int p = 0; p < 3; p ++){
                               if(p % 2 == 0) {
                                   count++;
                                   //break outerloop;   // uncomment this and comment continue to see the difference
                                   continue outerloop;  // between break and continue in action
                               }
                               System.out.println (p);
                }
                           System.out.println (n);
            }
                     System.out.println (m);
        }
        System.out.println("Loop has executed this many times " + count);


    } //close method


} //close class
