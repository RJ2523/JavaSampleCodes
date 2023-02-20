package org.example.Practise;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String args[]){
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(5,6);
        treeMap.put(6,8);
        Iterator<Integer> i = treeMap.values().iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
