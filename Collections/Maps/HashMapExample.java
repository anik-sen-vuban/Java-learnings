package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
//        Map<String, Integer> m = new HashMap<>();
//        for(String item : args){
//            Integer freq = m.get(item);
//            m.put(item, (freq == null ? 1 : freq + 1));
//        }
//        System.out.println(m.size() + " distinct words detected.");
//        System.out.println(m);

        //Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        //put() add key value pairs
        map.put("anik", 25);
        map.put("rahim", 30);
        map.put("karim", 22);

        System.out.println("After put(): " + map);

        //get() value using a key
        System.out.println("Anik's age: " + map.get("anik"));

        //get value or return a default value
        System.out.println("Sakib's age: " + map.getOrDefault("sakib", 1000));

        //Check whether a key exists
        System.out.println("Contains anik? " + map.containsKey("anik"));

        //Check whether a value exists
        System.out.println("Contains value 30? " + map.containsValue(30));
        System.out.println("Contains value 100? " + map.containsValue(100));

        //Add only if the key does not exist
        map.putIfAbsent("anik", 500);//Doesn't replace 25
        map.putIfAbsent("sakib", 10);
        System.out.println("After putIfAbsent(): " + map);

        //Add only if the key does not exist
        map.replace("anik", 26);
        System.out.println("After replace anik's value: " + map);

        //Conditional Replace only if old value matches
        map.replace("rahim", 30, 31);
        System.out.println("After conditional replace rahim's value: " + map);

        //Number of key-value pairs
        System.out.println("Size: " + map.size());

        //Get all keys
        System.out.println("Keys: " + map.keySet());

        //Get all values
        System.out.println("Values: " + map.values());

        //entrySet() - Get key and value together
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //forEach() - Easy way to loop through the map
        map.forEach((key, value) -> System.out.println(key + " = " + value));

        //remove(key) - Remove a key-value pair
        map.remove("Karim");
        System.out.println("After remove() the karim: " + map);

        //remove(key, value) - Remove only if both match
        map.remove("Sakib", 24);
        System.out.println("After remove(key, value): " + map);

        //putAll() - Copy all entries from another map
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Nila", 21);
        anotherMap.put("Rafi", 23);
        map.putAll(anotherMap);
        System.out.println("After putAll(): " + map);

        //replaceAll() - Change all values
        map.replaceAll((key, value) -> value + 1);
        System.out.println("After replaceAll(): " + map);

//        //compute() - Calculate/update a value
//        map.compute("Anik", (key, value) -> value + 5);
//        System.out.println("After compute(): " + map);

//        //computeIfAbsent() - Add value if key is absent
//        map.computeIfAbsent("Siam", key -> 20);
//        System.out.println("After computeIfAbsent(): " + map);

        //computeIfPresent() - Update value if key is present
//        map.computeIfPresent("Anik", (key, value) -> value + 10);
//        System.out.println("After computeIfPresent(): " + map);

        //merge() - Combine an existing value with a new value
        map.merge("anik", 5, Integer::sum);
        System.out.println("After merge(): " + map);

        //isEmpty() - Check whether the map is empty
        System.out.println("Is empty: " + map.isEmpty());

        //clear() - Remove everything
        map.clear();
        System.out.println("After clear(): " + map);
    }
}
