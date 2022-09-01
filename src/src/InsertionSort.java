import java.util.Arrays;

public class InsertionSort {
    static int[] insertionSortIncreasing(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }
        for(int i =1;i< arr.length;i++){
            int key =arr[i];
            int j =i-1;
            while(j>= 0 && arr[j] >key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1] =key;

        }
        return  arr;
    }

    static int[] insertionSortDncreasing(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }
        for(int i =1;i< arr.length;i++){
            int key =arr[i];
            int j =i-1;
            while(j>= 0 && arr[j] <key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1] =key;

        }
        return  arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 1, 34, 23, 456, 212, 56, 3, 8};
        System.out.println(Arrays.toString(insertionSortIncreasing(arr)));
        System.out.println(Arrays.toString(insertionSortDncreasing(arr)));
    }
}
