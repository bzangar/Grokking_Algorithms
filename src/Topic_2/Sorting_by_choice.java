package Topic_2;

public class Sorting_by_choice {
    public static void main(String[] args) {
        int [] arr = {11, 3, 4, 9};
        int [] sortedArray = sortedArray(arr);
        for(int a: sortedArray){
            System.out.print(a + " ");
        }
    }

    static int[] sortedArray(int[] arr){
        int [] copiedArray = arr;
        int [] sortedArray = new int [arr.length];
        for(int i = 0; i < copiedArray.length; i++){
            int maxElement = maxIndexOfElement(arr);
            sortedArray[i] = arr[maxElement];
            arr[maxElement] = Integer.MIN_VALUE;
        }
        return sortedArray;
    }

    static int maxIndexOfElement(int[] arr){
        int maxElement = arr[0];
        int maxElementIndex = 0;
        for(int i = 1; i < arr.length; i ++){
            if(arr[i] >= maxElement){
                maxElementIndex = i;
                maxElement = arr[i];
            }
        }

        return maxElementIndex;
    }
}
