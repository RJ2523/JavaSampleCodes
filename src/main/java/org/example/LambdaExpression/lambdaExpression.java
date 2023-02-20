package org.example.LambdaExpression;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class lambdaExpression{

    //As described earlier, functional interfaces can contain only one abstract method.     
    //However, they can include any quantity of default and static methods. 


    /* 
    
       Lambda expressions basically express instances of functional interfaces (An interface with single abstract
       method is called functional interface. An example is java.lang.Runnable). lambda expressions implement the only
       abstract function and therefore implement functional interfaces

    */
    public interface fn{
        public void fn1(int x);
    }
    public static void main(String args[]){
        AbstractInterface abstractInterface =  (x)->{System.out.println("x: "+x);};
        abstractInterface.printValue(2);
        abstractInterface.defaultMethod();
        
        Consumer<Integer> consumer = (value)->{System.out.println("value: "+ value);};
        Function<Integer, String> x2 =  (x)->{return "hello";};
    

    
        // NonFucntionalInterface nonI = (int x)->{System.out.println("new1");};
        // AbstractInterface ai = (int x)->{System.out.println("x " + x);};
        // ai.printValue(3);
        // fn printX = (int x)->{System.out.println(x);};
        // fn squareX = (x)->{System.out.println(x*x);};
        // printX.fn1(6);
        // squareX.fn1(6);

        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(5);
        // arr.add(7);
        // arr.add(9);
        // arr.add(11);

        // arr.forEach(x->{if(x%2!=0)System.out.println(x);});

    }
    
}
