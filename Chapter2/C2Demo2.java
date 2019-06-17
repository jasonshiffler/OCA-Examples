/**
 * This file illustrates the following concepts from Chapter 1 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -logical operators
 * -short circuit operators
 * -if-then statements
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */


package Chapter2;

public class C2Demo2 {

    public static void main(String args[]) {
        logicalDemo();
        shortCircuitDemo();
        ifThen();
    }

    /**
     * This method shows the basic logical operators
     */
    private static void logicalDemo() {
        System.out.println("true and true is " + (true & true));
        System.out.println("true and false is " + (true & false));
        System.out.println("true or false is " + (true | false));
        System.out.println("true XOR true is " + (true ^ true));
        //System.out.println("true XOR true is " + (True ^ True)); //java is case sensitive!
    }

    /**
     * This method shows the difference between the standard logical operators and the short circuit
     * operators
     */
    private static void shortCircuitDemo() {

        int x = 5;
        int y = 8;
        String string = null;

        if ((x < 7) | ((++y) > 5)) {
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }

        x = 5;
        y = 8;

        if ((x < 7) || ((++y) > 5)) {     //y is never incremented because x < 7 is true which is all that's needed
            //to make the if statement evaluate to true.
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }

        if ((string != null) && (string.length() < 5)) {
            System.out.println("Throw Exception!");
        } else {
            System.out.println("short circuit operator prevented a null pointer exception");
        }

        /** This will throw an exception since string length will be checked even if the string is null
        if ((string != null) & (string.length() < 5)) {
            System.out.println("Throw Exception!");
        }
        */

    } //close method

    /**
     * Shows how and if then statement can flow
     * */

    private static void ifThen(){

        int i = 0;

        if(true && true)                //the statement inside the () must be a boolean expression
            System.out.println(true);   //Curly braces are only required for multiple statements of execution


        if(false)
            System.out.println(false);
            i++;                        //i is always incremented, this isn't Python!


        if(false){                      //This block behaves differently than the previous
            System.out.println(false);  //i is only incremented if the if evaluates to true
            i++;
        }

        if(false){                      //block demonstrates if-elseif-else flow
            System.out.println(false);
        } else if(false){
            System.out.println(false);
        } else {
            System.out.println(true);
        }//close if


    } //close method


    /**
     * Shows how the ternary operator works it is in the form of
     *
     * booleanExpression ? expression1 : expression2
     *
     * and is a condensed version of if then else
     *
     * */

    private static void ternaryDemo(){


    }



} //close class
