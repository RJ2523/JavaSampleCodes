package org.example.LambdaExpression;

//A functional interface is an interface that contains only one abstract method

//A functional interface can have any number of default methods ans static methods

//Functional interfaces are included in Java SE 8 with Lambda expressions and Method 
//references in order to make code more readable, clean, and straightforward.


//Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations. These are:

/* 
    Consumer
    Predicate - A predicate functional interface of java is a type of function which accepts a single value or argument and does some sort of processing on it, and returns a boolean (True/ False)
    Function 
    Supplier - This type of functional interface is generally used in the lazy generation of values. Supplier functional interfaces are also used for defining the logic for the generation of any sequence. 

*/
@FunctionalInterface
public interface FunctionInterfaces {
    public abstract void fun();
}