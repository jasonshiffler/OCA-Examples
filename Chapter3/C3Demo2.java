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

import java.util.*;          //Could either use this import to grab all classes in the package
import java.util.ArrayList;  //or import each class individually
import java.util.Arrays;    //Needed for Arrays.sort and Arrays.binarySearch

public class C3Demo2 {


    public static void main(String[] args) {

        arrayDemo();
        multidArrays();
        arrayListDemo();

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


        //Searching an array returns the index of the value being searched for
        //In order to search the Array it must be sorted first
        //If the answer is negative the value is not in the array. the value returned is the # of the element in the
        //array it would be, though not the index.
        //If the value is found the index is returned

        System.out.println(Arrays.binarySearch(string1, "45"));
        System.out.println(Arrays.binarySearch(string1, "300"));


    }  //close method


    /**Shows the basics of multidimensional arrays*/
    private static void multidArrays(){

        int[][] vars1;              //2D Array
        int vars2[][];              //2D Array
        int[] vars3[];              //2D Array
        int[] vars4[], vars5[][];   //2D Array and a 3D Array

        String[][] rectangle = new String[3][2]; //Setting the size for the array

        //Creating an asymetric Array
        int[][] dSize = { {1,2,3}, {1}, {5,7} }; // The array doesn't have to be symmetric

        System.out.println(dSize[0][1]);         //Answer is 2

        //Another way to create an asymmetric Array
        int[][] mda1 = new int[50][];
        mda1[0] = new int[5];

       //int[][] mda2 = new int[][]; //The first dimension of the array must be present

        //iterating through a multi D array
        for (int[] d1array: dSize)
            for (int num: d1array)
                System.out.println(num);

    } //close method

    /**
     * Shows the basics of ArrayList class. ArrayLists are nice because they will resize themselves.
     * */

    private static void arrayListDemo() {

        //Multiple ways to delcare an ArrayList

        ArrayList alist1 = new ArrayList();
        ArrayList<Integer> alist2 = new ArrayList<Integer>(); //Use of Generics to restrict the type of reference
        ArrayList<Integer> alist3 = new ArrayList<>();     //Don't have to specify the type on the right side in Java7+
        //ArrayList<int> alist4 = new ArrayList<>();        //An ArrayList can only hold a reference type

        //ArrayList<String> alist5 = new List<>();   //A List is an interface not a class
        List<String> list1 = new ArrayList<>();      //Since ArrayList implements List this is ok

        ArrayList<String> alist6 = new ArrayList<>(10);  //Create an ArrayList while initializing the size
                                                            //This isn't required as the ArrayList will dynamically size
        alist6.add("One");                                   //itself
        alist6.add("Two");
        alist6.add("Three");
        alist6.add("Two");
        System.out.println(alist6);        //ArrayList has a toString Method
        alist6.remove("Two");           //removes the first matching value in the ArrayList
        System.out.println(alist6);
    }




}
