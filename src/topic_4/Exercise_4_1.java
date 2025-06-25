package topic_4;

public class Exercise_4_1 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        System.out.println("Sum of arr: " + sum(arr));
    }

    static int sum(int[] n){
        int sum = 0;
        for(int a: n){
            sum+=a;
        }
        return sum;
    }
}
