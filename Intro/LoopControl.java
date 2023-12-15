package Intro;

public class LoopControl {
    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"Moses", "Maurice", "Fred", "Lacy"};

        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
            if (name.startsWith("M")){
                System.out.println("Name Starts with 'M' :" + name);
            }else {
                System.out.println("Name does not start with 'M' : " + name);
            }
            System.out.println("\n");
        }

        //ARRAYS & INDEX

        System.out.println("Elements of the 'numbers' array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\nElements of the 'names' array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Element at index " + i + ": " + names[i]);
        }

        // Modifying an element in the integer array
        names[2] = "Nyangoya";

        System.out.println("\nModified elements of the 'Names' array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Element at index " + i + ": " + names[i]);
        }
    }
}
