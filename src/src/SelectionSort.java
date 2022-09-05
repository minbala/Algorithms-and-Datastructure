import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static int[] selectionSort(int[] arr){
        if(arr.length ==0 || arr.length ==1) return arr;
        for(int i =0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int key=arr[i];
            arr[i] =arr[min];
            arr[min]=key;

        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements you want to sort : ");
        int n =sc.nextInt();
        int[] arr =new int[n];
        for(int i= 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
}
