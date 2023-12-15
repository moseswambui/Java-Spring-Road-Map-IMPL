package DataStructures;

public class FibArrayList {
    public static void main(String[] args){
        int[] fibArray = {0, 1, 1, 2, 4,5,9,13,21};

        //ACCESS ELEMENTS IN THE ARRAY
        System.out.println("First Element of Fiboncaci Sequence: "+ fibArray[0]);
        System.out.println("Fiboncaci Array Sequence Length: "+ fibArray.length);

        //ITERATE THROUGH THE ARRAY
        System.out.println("\n\nFiboncaci Sequence Numbers: \n");
        for (int i: fibArray){
            System.out.print(i + "");
        }

        //UPDATING THE ARRAY
        fibArray[4] = 3;
        fibArray[6] = 8;
        System.out.println("\n\nFiboncaci Sequence Numbers In correct Order: \n");
        for (int i: fibArray){
            System.out.print(i + "");
        }
    }
}
