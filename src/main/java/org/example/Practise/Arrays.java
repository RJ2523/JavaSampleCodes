package org.example.Practise;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(6);
        list.add(2,7);
        list.add(10);
        System.out.println(list.contains(5));
        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(10));
        list.set(1,5);
        for(Integer i : list){
            System.out.print(i+ " ");
        }
    }
}
