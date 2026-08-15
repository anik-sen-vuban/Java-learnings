package Collections.Excercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;

//Character by character approach
public class Excercise2 {
//    static void wordFrequencyCounter(String[] strs){
//        Map<String, Integer> map = new HashMap<>();
//        for(String str : strs){
//            String x = "";
//            for(int i = 0; i < str.length(); i++){
//                if (str.charAt(i) != ' ') x += str.charAt(i);
//                else{
//                    Integer freq = map.get(x);
//                    map.put(x, (freq == null ? 1 : freq + 1));
//                    x = "";
//                }
//            }
//            if (!x.isEmpty()) {
//                Integer freq = map.get(x);
//                map.put(x, (freq == null ? 1 : freq + 1));
//            }
//        }
//        map.forEach((key, value) -> System.out.println(key + " = " + value));
//    }

//using split() -> split the sentence into words
    static void wordFrequencyCounter(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : strs){
            String[] words = str.split(" ");
            for(String word : words){
                Integer freq = map.get(word);
                map.put(word, (freq == null ? 1 : freq + 1));
            }
        }
        map.forEach(
                (key, value) ->
                        System.out.println(key + " = " + value)
        );
    }
    public static void main(String[] args) {
        String[] strs = {
                        "Ami",
                        "Tumi",
                        "Ami Tumi",
                        "Tumi Ami Ek Sathe"
        };
        wordFrequencyCounter(strs);
    }
}
