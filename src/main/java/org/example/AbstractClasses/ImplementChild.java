package org.example.AbstractClasses;

public class ImplementChild extends Implement{
    public void abstractFunction2(){
        System.out.println("Abstract 2");
    }
    @Override
    public void abstractFunction(){
        System.out.println("from implementChild class");
    }
}
