package org.example.Practise;

import java.util.LinkedList;
import java.util.List;


//uses Doubly linked list
public class LinkedLists {
    public static void main(String args[]){
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Ji");
        list.add("kaise");
        list.add("ho");
        list.add("saare");

        System.out.println(list.contains("saare"));
        for(String item: list){
            System.out.print(item+ " ");
        }

    }
}
