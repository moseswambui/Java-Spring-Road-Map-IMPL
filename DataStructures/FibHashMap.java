package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class FibHashMap {
    public static void main(String[] args){

        // Declare and initialize a HashMap of <Integer, String>
        Map<Integer, String> fibNumbersMap = new HashMap<>();

        //Add key-value pairs to the HashMap
        fibNumbersMap.put(0, "Zero");
        fibNumbersMap.put(0, "Zero");
        fibNumbersMap.put(1 , "One");
        fibNumbersMap.put(2, "Two");
        fibNumbersMap.put(3, "Three");
        fibNumbersMap.put(5, "Five");

        // Access values using keys
        System.out.println("Fibonacci Number with ID/Key 0:" + fibNumbersMap.get(0));
        System.out.println("HashMap size:" + fibNumbersMap.size());

        // Iterate through the HashMap
        System.out.println("FibonacciMap entries: ");
        for (Map.Entry<Integer, String>  entry: fibNumbersMap.entrySet()){
            System.out.println(
                    "ID: "+ entry.getKey() + ", Name : " + entry.getValue()
            );
        }

    }
}
