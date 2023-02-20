package org.example.AbstractClasses;

//what does it mean to be declared abstract
//the implemenation should be hidden from outside world

//diff btw interface and abstract class
    // 1. abstract class can have method implementation
    // 2. can only extend one abstract class, but we can implement many interfaces
    // 3. abstract class can implement interface.

//When to use abstract classes
    //In the java application, there are some related classes that need to share some 
    //lines of code then you can put these lines of code within the abstract class and 
    //this abstract class should be extended by all these related classes.

    //You can expect that the classes that extend an abstract class have many common methods or fields,
    //or require access modifiers other than public (such as protected and private).

public abstract class AbstractJava {
    public abstract void abstractFunction();
    AbstractJava(){
        System.out.println("Constructor for abstract class");
    }
    public abstract void abstractFunction2();
    //final functions cannot be overridden.s
    public final void finalFunction(){
        System.out.println("Final Function");
    }
    public static void staticFunction(){
        System.out.println("static function");
    }
    public void dummyFunction(){
        System.out.println("Dummy function");
    }
}