package Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//        Set<String> s = new HashSet<>();
//
//        for (String str : args){
//            System.out.println(str);
//            if(!s.add(str)) {
//                System.out.println("Duplicate detected");
//            }
//        }
//        System.out.println(s.size() + " distinct words detected " + s);

        //Create a HashSet
        Set<String> fruits = new HashSet<>();

        //Insert one element to the HashSet, duplicate elements are automatically removed
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        //This will not be added again
        fruits.add("Apple");
        System.out.println("After add(): " + fruits);

        //add(null) -> HashSet allows one null value
        fruits.add(null);
        fruits.add(null); //it will be ignored
        System.out.println("After adding null " + fruits);

        //Returns the number of unique elements
        System.out.println("Size: " + fruits.size());

        //Check whether an element exists in the HashSet
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Contains Orange? " + fruits.contains("Orange"));

        //remove a specific elements
        fruits.remove("Banana");
        System.out.println("After remove Banana " + fruits);

        //Check weather a HashSet is empty
        System.out.println("Is empty? " + fruits.isEmpty());

        //for-each loop
        //HashSet does NOT guarantee insertion order.
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        //Iterator -> Another way to traverse a HashSet
        System.out.println("using Iterator");
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Adds all elements from the another collection/set
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Orange");
        moreFruits.add("Grapes");
        moreFruits.add("Mango");

        fruits.addAll(moreFruits);
        System.out.println("After addAll(): " + fruits);

        //Check whether all element of another collection are present in this HashSet
        System.out.println("Contains all moreFruits in fruits? " + fruits.containsAll(moreFruits));

        //Keep only the common elements between two sets
        //This is similar to SET INTERSECTION
        Set<String> commonFruits = new HashSet<>(fruits);
        commonFruits.retainAll(moreFruits);

        System.out.println("Common elements: " + commonFruits);

        //remove all elements that are also present in another collection/set
        Set<String> remainingFruits = new HashSet<>(fruits);
        remainingFruits.removeAll(moreFruits);
        System.out.println("After removeAll: " + remainingFruits);

        // Converts the HashSet into an array.
        Object[] array = fruits.toArray();
        for(Object element : array){
            System.out.println(element);
        }

        // Converts the HashSet into an array.
        fruits.clear();
        System.out.println("After clear(): " + fruits);

    }
}
