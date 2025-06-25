package topic_3;

public class Infinte_recursion {
    public static void main(String[] args) {
        infiniteRecoursion(7);

    }

    static void infiniteRecoursion(int n){
        System.out.println(n);
        if(n > 0) {
            infiniteRecoursion(n - 1);
        }
    }
}
