import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeInsertionSort {
    static int Threshold;
    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int  j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void merge(int[] arr,int low,int middle,int high){
        int leftArrLen =middle-low+1;
        int rightArrLen=high-middle;
        int[] leftArr=new int[leftArrLen];
        int[] rightArr=new int[rightArrLen];
        for(int i=0;i<leftArrLen;i++) leftArr[i]=arr[low+i];
        for(int j=0;j<rightArrLen;j++) rightArr[j]=arr[middle+j+1];
        int a=0, b=0, c=low;
        while(a<leftArrLen && b<rightArrLen){
            if(leftArr[a]>=rightArr[b]){
                arr[c] =rightArr[b];
                b++;
            }
            else{
                arr[c] =leftArr[a];
                a++;
            }
            c++;
        }
        while(a<leftArrLen){
            arr[c]=leftArr[a];
            a++;
            c++;
        }
        while(b<rightArrLen){
            arr[c]=rightArr[b];
            b++;
            c++;

    }
    }
    static void mergeInsertionSort(int[] arr,int low,int high){

            if(high-low<=Threshold){
                insertionSort(arr);
            }
           else {
                int middle = (low + high) / 2;
                mergeInsertionSort(arr, low, middle);
                mergeInsertionSort(arr, middle + 1, high);
                merge(arr, low, middle, high);

            }}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Threshold for insertion sort : ");
        Threshold =sc.nextInt();
        System.out.print("Enter the number of elements u want to sort : ");
        int n =sc.nextInt();
        int[] arr=new int[n];
        Random rand =new Random();
        for(int i=0;i<n;i++) arr[i] =rand.nextInt(n);
        System.out.println(Arrays.toString(arr));
        mergeInsertionSort(arr,0, n-1);
        System.out.println(Arrays.toString(arr));

    }
}
