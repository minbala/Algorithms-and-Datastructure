import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortRecur {
    static void insertionSortRecur(int[] arr,int n){
        if(n<=1) return;
        insertionSortRecur(arr,n-1);
        int key=arr[n-1];
        int j=n-2;
        while(j>=0&&arr[j]>key){
            arr[j+1] =arr[j];
            j--;
            }
        arr[j+1]=key;
        }

        public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the numer of elements u want to sort : ");
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        insertionSortRecur(arr,n);
        System.out.println(Arrays.toString(arr));








    }
}
