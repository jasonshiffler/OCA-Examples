/**
 * This file illustrates the following concepts from Chapter 4 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -method declarations
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */


package Chapter4;

import java.io.IOException;

public class C4Demo1 {


    /**
      Sample method declaration
     Access modifiers - public, private, protected, or default(package private). (default is no modifier)
     Optional modifiers - final and static
     Return type - void means no return type, could be any primitive or object
     Parameter list - variables passed in, parameters are optional.
     throws - exception that the method may throw. This is optional
    */

    public final static void sampleMethod (int param1, boolean param2) throws Exception{ }


    public void walk1(){}
    //default void walk2(){}    //the default access modifier isn't specified
    void walk3(){}              //uses default (package private) access)
    //void public walk4(){}     // order matters, access modifier goes first
    //void 2walk(){}            //Same rules apply to method names as variable names
    void $_walk2(){}

    int demoMethod1() {
        return 1;
        //return 1L; // must return an integer, not a long

    }
    long demoMethod2() {
        return 1; // this is ok since we can fit a smaller primitive into a larger one.

    }

    long demoMethod3(int one, int two){
        return 1L;
    }
    //long demoMethod4(int one; int two){} // parameter lists are comma separated

    //Exceptions are optional and comma separated
    long demoMethod4() throws NullPointerException, IOException {
        return 1L;
    }


    public void run1(int... nums){}
    public void run2(int thing, int... nums){}
    //public void run3(int... nums, int thing){} //Varargs can only appear once in a parameter list and must be last
    //public void run4(int... nums1, int... nums2){} //Can only use varargs once


}
