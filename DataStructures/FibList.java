package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class FibList {

    public static void main(String[] args){

        // Declare and initialize an ArrayList of Strings
        List<String> fibStringList = new ArrayList<>();

        fibStringList.add("Zero");
        fibStringList.add("One");
        fibStringList.add("One");
        fibStringList.add("Two");
        fibStringList.add("Four");

        // Access elements in the
        System.out.println("First Fibonnaci Element: " + fibStringList.size());

        // Iterate through the ArrayList
        System.out.println("FibonnaciList Elements");
        for(String fibStringNum: fibStringList){
            System.out.println(fibStringNum);
        }

        //Change Element in the array
        fibStringList.set(4, "Three");
        System.out.println(" New Fibonnaci List Elements");
        for(String fibStringNum: fibStringList){
            System.out.println(fibStringNum);
        }
    }

}
