package topic_3;

public class Recursion_Factorial {
    public static void main(String[] args) {
        int n = factorial(6  );
        System.out.println(n);
    }

    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        else {
            return n * factorial(n -1);
        }
    }
}
