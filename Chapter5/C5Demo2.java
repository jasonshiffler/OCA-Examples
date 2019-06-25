
/**
 * This file illustrates the following concepts from Chapter 5 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 *
 * -Overriding Methods
 *
 *
 *
 * Rules of Overriding Methods
 *
 * -Method in the child class must have the same signature as the method in the parent class
 *
 * -Method in the child class must be at least as accessible or more accessible than the method in the parent class
 *
 * -Method in the child class may not throw a checked exception that is broader than the class of any exception
 * thrown in the parent class method
 *
 * -If a method returns a value it must be the same or the subclass of the the method in the parent class. (Covariant)
 *
 */


package Chapter5;

public class C5Demo2 {
}
