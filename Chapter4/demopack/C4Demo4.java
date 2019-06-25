/**
 * This file illustrates the following concepts from Chapter 4 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -method access
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

package Chapter4.demopack;


public class C4Demo4 {

    public void publicDemo(){

        System.out.println("My name is public demo");

    }

    void defaultDemo(){

        System.out.println("My name is package private demo");

    }

    protected void protectedDemo(){

        System.out.println("My name is protected demo");

    }

}
