package org.example.LambdaExpression;

import java.util.function.BiFunction;
import java.util.function.Function;

// A functional interface can have any number of default methods.
@FunctionalInterface
public interface AbstractInterface {
  public abstract void printValue(int x);
  
  public default void defaultMethod(){
    System.out.println("default Method in functional interface");
  }
}
