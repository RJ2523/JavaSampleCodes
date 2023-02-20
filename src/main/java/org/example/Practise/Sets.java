package org.example.Practise;

import java.util.*;


// order is not maintained in HashSet
// opearions are done in O(1)

// Linked HashSet

// Linked HashSet maintains the insertion order while preserving the set properties

// It uses the combination of Linked List and Hash table internally

// we can use Linked HashSet to develop cache-based applications where duplicates
// are not allowed and insertion order is preserved.
public class Sets {
    public static void main(String args[]){
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        set.remove(5);
        for(int i : set){
            System.out.println(i);
        }

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.addFirst(3);
        for(int i : list2){
            System.out.print(i + " ");
        }
        System.out.println("");


        //By default, it will sort on the basis of natural sorting order.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Jasmine");
        treeSet.add("Robert");
        treeSet.add("Queue");

//        for(String names: treeSet){
//            System.out.println(names);
//        }

        System.out.println(treeSet.last());
    }
}
