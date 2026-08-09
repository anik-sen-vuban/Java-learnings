package Collections.Excercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Excercise1 {
    static Integer countUniqueNums(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Set: " + set);
        return set.size();
    }
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 20, 40, 20, 30};
        System.out.print("Array: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Uniqe nums: " + countUniqueNums(arr));
    }
}
