package Collections.Lists;

import Array.Array;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList<String> items = new ArrayList<>();
//        for(String item : args){
////            System.out.println(item);
//            items.add(item);
//        }
//        System.out.println("Collection Successfully " + items.size());
//
//        for(String item : items){
//            System.out.println(item);
//        }


//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(4);
//        nums.add(2);
//        nums.add(3);
//        System.out.println("First num: " + nums.getFirst());
//        System.out.println("Last num: " + nums.getLast());
//        System.out.println("Second num: " + nums.get(1));
//        for(int num : nums){
//            System.out.println(num);
//        }
//        nums.remove(1);
//        System.out.println("Size of the ArrayList after removing the second num: " + nums.size());
//        nums.removeFirst();
//        System.out.println("Size of the ArrayList after removing the first num: " + nums.size());
//        nums.removeLast();
//        System.out.println("Size of the ArrayList after removing the last num: " + nums.size());
//        nums.removeAll(nums);
//        System.out.println("Size of the ArrayList after removing all nums: " + nums.size());

        ArrayList<String> students = new ArrayList<>();

        //To insert elements
        students.add("Anik");
        students.add("Lokkhiii");
        students.add("Ranik");
        //To see the list
        System.out.println("After add(): " + students);

        //To insert elements at index
        students.add(2, "Promiti");
        System.out.println("After add(index): " + students);

        //To get a element using index
        System.out.println("Element at index 1: " + students.get(1));

        //To update a element using index
        students.set(0, "Dead One");
        System.out.println("After update: " + students);

        //To check element exists or not
        System.out.println("Contains Rahim? " + students.contains("Rahim"));

        //To find a index of a element
        System.out.println("Index of Lokkhiii: " + students.indexOf("Lokkhiii"));

        //To find index of last element
        System.out.println("Index of last element: " + students.lastIndexOf("Ranik"));

        //To see the size of the list
        System.out.println("Size of the list: " + students.size());

        //To check the list empty or not
        System.out.println("Is Empty? " + students.isEmpty());

        //To remove by index
        students.remove(0);
        System.out.println("After remove the index 0: " + students);

        //To remove by value
        students.add(0, "Anik");
        students.remove("Ranik");
        System.out.println("After remove(object): " + students);

        //To copy a list
        ArrayList<String> copy = (ArrayList<String>) students.clone();
        System.out.println("Cloned list: " + copy);

        //To compare two list
        System.out.println("Is Equal? " + students.equals(copy));

        //To add another list with the existing list
        ArrayList<String> newStudents = new ArrayList<>();
        newStudents.add("Rahim");
        newStudents.add("Karim");

        students.addAll(newStudents);
        System.out.println("After addAll : " + students);

        //To remove all matching elements
        students.removeAll(newStudents);
        System.out.println("After remove all matching elements: " + students);

        //To keep common elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Anik");
        list2.add("Lokkhiii");
        list2.add("Ranik");
        students.retainAll(list2);
        System.out.println("After retainAll: " + students);

        //To remove all elements
        copy.clear();
        System.out.println("After clear the copy list: " + copy);

        //for-each loop
        for(String student : students){
            System.out.println(student);
        }

        //To sort the list
        Collections.sort(students);
        System.out.println("After sorting the list: " + students);

        //To reverse the list
        students.add("Ranik");
        Collections.reverse(students);
        System.out.println("After reversed: " + students);

        //To shuffle a list
        Collections.shuffle(students);
        System.out.println("After shuffle: " + students);
    }
}
