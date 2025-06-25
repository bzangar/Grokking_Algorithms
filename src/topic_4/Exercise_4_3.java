package topic_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_4_3 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 4, 5));
        System.out.println(recorsion_find_max_in_list(arr));


    }
    static int recorsion_find_max_in_list(ArrayList<Integer> arr){
        if(arr.size() == 1){
            return arr.get(0);
        } else {
            if(arr.getFirst() < arr.getLast()){
                arr.removeFirst();
            } else if(arr.getFirst() > arr.getLast()){
                arr.removeLast();
            } else {
                arr.removeLast();
            }
            return recorsion_find_max_in_list(arr);
        }

    }
}
