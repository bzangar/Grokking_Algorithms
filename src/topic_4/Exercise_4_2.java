package topic_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_4_2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(recursion_sum(arr));
    }
     static int recursion_sum(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            return 0;
        } else{
            int head = arr.get(0);
            arr.remove(0);
            return head + recursion_sum(arr);
        }
     }
}
