package Chapter4;

/**
 * This file illustrates the following concepts from Chapter 4 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -method access
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */



public class C4Demo3 {


    //Only accessible from this class
    private void privateDemo() {

        System.out.println("My name is privateDemo");

    }

    //Accessible to members of the same package
    void defaultDemo() {

        System.out.println("My name is default Demo");
    }

    //Accessible to members of the same package or subclass
    protected void protectedDemo() {

        System.out.println("My name is protected Demo");

    }



}
