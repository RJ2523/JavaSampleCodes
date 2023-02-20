package org.example.LambdaExpression;

@FunctionalInterface
public interface NonFucntionalInterface {
    public abstract void new1(int x);
    public static void new2()
    {
        System.out.println("static method inside interface");
    }
}