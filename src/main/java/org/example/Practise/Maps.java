package org.example.Practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        Iterator i = map.keySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
       for(Integer z : map.keySet()){
           System.out.println(z + " ");
       }
        for(Map.Entry<Integer,String> data: map.entrySet()){
            System.out.println("Key is "+data.getKey()+" and value is "+data.getValue());
        }

    }

}
