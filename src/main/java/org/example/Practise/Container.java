package org.example.Practise;

import java.util.ArrayDeque;
import java.util.Collection;

public class Container<T>{
    T value;
    public void showType(){
        System.out.println(value.getClass().getName());
    }
    public static void main(String[] args){
        Container<Integer> val = new Container<>();
        val.value = 4;
        val.showType();
    }
}