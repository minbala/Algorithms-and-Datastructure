import java.util.Arrays;
import java.util.Scanner;

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
        if(arr.length <=1){
            return arr;
        }
        for(int i =1;i< arr.length;i++){
            int key =arr[i];
            int j =i-1;
            while(j>= 0 && arr[j] <key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] =key;

        }
        return  arr;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements you want to sort : ");
        int n =sc.nextInt();
        int[] arr =new int[n];
        for(int i= 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(insertionSortIncreasing(arr)));
        System.out.println(Arrays.toString(insertionSortDncreasing(arr)));
    }
}
