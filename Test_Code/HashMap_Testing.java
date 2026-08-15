package Test_Code;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_Testing {
    public static void main(String[] args) {
        ArrayList<String> departments = new ArrayList<>();
        departments.add("CSE");
        departments.add("SWE");
        departments.add("EEE");
        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
        for(String dept : departments){
            map.put(dept, new HashMap<>());
            map.get(dept).put("Regular", 0);
            map.get(dept).put("Scholarship", 0);
        }
        System.out.println(map.get("CSE").get("Regular") + 1);
        map
                .get("CSE")
                .put(
                        "Regular",
                        map.get("CSE").get("Regular") + 1
                );

    }
}
