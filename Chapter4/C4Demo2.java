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

import Chapter4.demopack.C4Demo4;

public class C4Demo2 extends C4Demo4{

    static public void main(String args[]) {

        C4Demo3 demo1 = new C4Demo3();
        C4Demo4 demo2 = new C4Demo4();
        C4Demo2 demo3 = new C4Demo2();

        //demo.privateDemo();   //private methods are only accessible in the same class
        demo1.defaultDemo();     //C4Demo2 and C4Demo3 are in the same package so this is accessible
        demo1.protectedDemo();
        demo2.publicDemo();
        //demo2.defaultDemo();  //not accessible since the C4Demo4 class isn't in the same package
        demo3.protectedDemo();  //This method is accessible since C4Demo2 extends C4Demo4


    }




}
