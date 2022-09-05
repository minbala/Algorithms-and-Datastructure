import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void merge(int[] arr,int low,int middle,int high){

        int leftArrLen =middle-low+1;
        int rightArrLen=high-middle;
        int[] leftArr =new int[leftArrLen];
        int[] rightArr=new int[rightArrLen];
        for(int i=0;i<leftArrLen;i++) leftArr[i] =arr[low+i];
        for(int j=0;j<rightArrLen;j++) rightArr[j]=arr[middle+j+1];
        int a=0,b=0,c=low;
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

    static void mergeSort(int[] arr,int low,int high){
        if(low<high) {
            int middle = (low + high) / 2;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr, low, middle, high);

        }
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements you want to sort : ");
        int n =sc.nextInt();
        int[] arr =new int[n];
        for(int i= 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

}}
