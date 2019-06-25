/**
 * This file illustrates the following concepts from Chapter 4 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -pass by value
 * -Method Overloading
 * -Method Overloading with Autoboxing
 *
 * Overloaded Method priority
 * -Exact match by type.
 * -convert from smaller to larger primitive type
 * -Autobox
 * -VarArgs
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */


package Chapter4;

public class C4Demo6 {


    public static void main(String[] args){

        int num = 4;
        String str1 = "thing";
        StringBuilder sb1 = new StringBuilder("Change me"  );

        passbyValue(num, str1,sb1);


        //Java is a pass by reference language. The value of num was copied into the method
        //A new reference variable was created to the same string object but the String itself was not changed nor
        //was the original reference variable
        System.out.println(str1);
        System.out.println(num);


        //String builder has been mutated
        System.out.println(sb1);

        //play(4); // doesn't work, converts to a long, but java won't convert twice from int to long to Long
                   //if the Object parameter version of the method is uncommented it will work since java
                   //will convert from int to Integer which is an object
        play(4L);

    }


    public static void passbyValue(int num, String str1, StringBuilder sb1){

        str1 = "Not a thing";   //the local variable is referencing a different String object now;
        num = 8;                //local var is holding a different value now

        //This local variable sb1 is pointing to the same object as the other sb1
        sb1.append("Change me");

    }


    //These two methods are overloaded because they use the same method name but a different set of parameters
    public int fly(int a, int b) { return b; }
    public int fly(int a) { return a; }

    //if the return type is different but the parameters and name are the same as another method it isn't legal
    //static modifier doesn't solve the problem

    //public String fly (int a, int b) {return "Hello";}
    //public static String fly (int a, int b) {return "Hello";}
    //public static int fly(int a) { return a; }

    void testing(int[] args) {}
    //void testing(int... args){} //varargs are treated the same as an array so these methods are duplicates


    //used to show how java won't convert from int to long to Long
    public static void play (Long l){}
    public static void play(Long... l){}
    //public static void play(Object o){}




}
