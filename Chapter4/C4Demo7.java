/**
 * This file illustrates the following concepts from Chapter 4 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Creating Constructors
 * -this
 *
 *If NO constructor exists in the class java will create a default no argument constructor
 *
 * Order of initialization
 *
 * -initialize the superclass
 * -static variables and instance initializers
 * -Instance variables and instance initializers
 * -The Constructor
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */


package Chapter4;

public class C4Demo7 {

  private String finale;


    static public void main(String args[]){

        C4Demo7 test = new C4Demo7();

    }



    //c4demo7(){} // needs to match the class name exactly
    public int C4Demo7(){return 1;} //This is ok but it isn't a constructor

    C4Demo7(){
        //int = 5; // only comments can come before this
        //this is ok
        this(5);   //this keyword is used to call another constructor. must be first statement in the constructor
                   //a comment can come before this

        finale = "This is it!"; //A constructor can assign a final variable
    }

    //It's ok to have overloaded constructors

   private C4Demo7(int a){
        System.out.println("Hello!");


    }


}
