/**
 * This file illustrates the following concepts from Chapter 3 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Arrays
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */


package Chapter3;

public class C3Demo2 {


    public static void main(String[] args) {

        arrayDemo();

    }

    private static void arrayDemo(){

        //multiple ways to declare an array reference
        int[] numbers1;
        int [] numbers2;
        int []numbers3;
        int numbers4[];
        int numbers5 [];

        //Here we're creating the array object as well as the reference

        int numbers6[] = new int[5];  //create an empty array of size 5
        int numbers7[] = new int[] {1,2,3,4,5}; //create a populated array of size 5
        int numbers8[] = {1,2,3,4,5,6,7,8};

        //This is tricky
        int[] numbers9, numbers10; // declares two arrays
        int numbers11[], numbers12; //declares 1 array, one int

        int numbers13[] = new int[10];

        System.out.println(numbers13.length); //The Array has a length of 10 even though it is empty
                                              //note that length is a property, not a method

        System.out.println( numbers8[1]);  //access the second index of the array

        int numbers14[] = {4,87,23,45,1,865,34};
        System.out.println(numbers14.toString()); // this just prints the object hash

        for(int i: numbers14)
            System.out.print(i + " ");
        System.out.println();

        java.util.Arrays.sort(numbers14); //This static method can be used to sort an Array
                                           //we can use the full name of sort if we don't want to use an import

        for(int i: numbers14)
            System.out.print(i + " ");
        System.out.println();


        //This sort doesn't work as expected since it as an alphabetical sort, not numerical with Strings

        String string1[] = {"4","9", "87","23","45","1","865","34"};
        java.util.Arrays.sort(string1);
        for(String i: string1)
            System.out.print(i + " ");
        System.out.println();

    }


}
