package Intro;

public class variable {
    static int staticVariable = 1;
    int instanceVariable = 2;
    public void methodName(int methodParameter){
        int methodLocalVariable = 3;

        if (true){
            int blockVariable = 4;
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = a + b;

        System.out.println(c);
    }
}
