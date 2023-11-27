package Intro;

public class Operators {
    public static void main(String[] args){
        int num1 = 1000;
        int num2 = 475;

        System.out.println("Num 1 + Num 2 = " + (num1 + num2));
        System.out.println("Num 1 - Num 2 =" + (num1 - num2));
        System.out.println("Num 1 * Num 2 =" + (num1 * num2));
        System.out.println("Num 1 / Num 2 =" + (num1 / num2));
        System.out.println("Num 1 % Num 2 =" + (num1 % num2));

        //ASSIGNMENT OPERATORS
        int num3 = 20;
        int num4 = 30;

        num4 = num3;
        System.out.println("=output:" + num4);

        num4 -= num3;
        System.out.println("-=output:" + num3);

        //LOGICAL OPERATORS

        boolean b1= true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + ! (b1 && b2));

        //RELATIONAL  ==,=, !=

        //BITWISE OPERATOR
        int num11 = 11;
        int num22 = 22;
        int my_result = num11 & num22;
        System.out.print("num1 & num2:\n "+ my_result);

        my_result = num11 | num22;
        System.out.print("num1 | num2: \n"+ my_result);

        my_result = num11 ^ num22;
        System.out.print("num1 ^ num2:\n "+ my_result);

        my_result = num11;
        System.out.print("num1 ~ num2: \n"+ my_result);

        my_result = num11 << 2;
        System.out.print("num1 ~ num2: \n"+ my_result);

        my_result = num11 >> 2;
        System.out.print("num1 >> num2:\n "+ my_result);

        my_result = num11 >>> 2;
        System.out.print("num1 >>> num2 \n: "+ my_result);
    }
}
