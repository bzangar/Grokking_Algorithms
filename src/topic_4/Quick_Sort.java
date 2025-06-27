package topic_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Quick_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(9, 8, 7, 6, 5, 4, 3, 2 ,1));
        ArrayList<Integer> result = qsort(arr);
        System.out.print("Отсортированный список: ");
        for(int a: result){
            System.out.print(a + " ");
        }


    }

    static ArrayList<Integer> qsort(ArrayList<Integer> arr){
        if(arr.size() < 2){
            return arr;
        } else {
            int opora = arr.get(0);
            ArrayList<Integer> less = arr.stream().
                    filter(a -> a < opora).collect(Collectors.toCollection(ArrayList::new));
            ArrayList<Integer> more = arr.stream().
                    filter(a -> a > opora).collect(Collectors.toCollection(ArrayList::new));

            ArrayList<Integer> result = new ArrayList<>(qsort(less));
            result.add(opora);
            result.addAll(qsort(more));
            return result;
        }
    }
}
