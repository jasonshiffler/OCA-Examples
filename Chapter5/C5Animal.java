/**
 * This file illustrates the following concepts from Chapter 5 of the OCA Java SE 8 Study Guide.
 * Think like the compiler!
 *
 * Abstract classes
 * Abstract Methods
 *
 * Abstract class rules
 *
 * -Abstract classes can't be instantiated directly
 * -Abstract classes can be defined with any number including zero of abstract and non abstract methods
 * -An abstract class that extends another abstract class inherits all of its abstract methods as well as its own
 * -The first concrete class that extends an abstract class must provide an implementation for all of the inherited
 * abstract methods
 *
 * Abstract Method rules
 * -Abstract methods may only be defined in abstract classes
 * -Abstract methods may not be marked as private or final
 * -Abstract methods must not provide a method body in the abstract class it is declared
 * -Implementing an abstract method follows same rules as overriding a method. name and signature must be the same
 * visiblity must be at least as accessible as the method in the parent class
 *
 */


package Chapter5;

/*final*/ abstract public class C5Animal { //An abstract class shouldn't be marked as final, it's purpose is to be
                                           //extended
  protected int age;

  public void eat() {

      System.out.println("Animal is eating");

  }

  abstract public String getName();

  //abstract public String getSpecies{return "Undefined"}; //Don't define an implementation for an abstract method
                                                           //in the abstract class

    //abstract final String getPhylum();  //Abstract method shouldn't be marked as final, it needs to be extended

    //abstract private String getPhylum(); //Abstract method shouldn't be marked as private, subclass needs to access it

}
