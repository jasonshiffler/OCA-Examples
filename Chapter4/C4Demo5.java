/**
 * This file illustrates the following concepts from Chapter 4 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * -Lambda
 *
 *
 * Uncomment purposefully inserted mistakes to see the compiler errors
 */

package Chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class C4Demo5 {



    static public void main(String[] args){

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",false,true));
        print(animals, a->a.canHop());

    } //close method


    private static void print(List<Animal> animals, Predicate<Animal> checker){

        for (Animal animal:animals){

            if(checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    } //close method


} //close class


class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {

        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
     }

     public boolean canHop() {return canHop;}

    public boolean canSwim() {return canSwim;}

    public String toString() {return species;}


}
