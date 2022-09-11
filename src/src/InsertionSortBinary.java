import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortBinary {
    static int[] insertionSortBinary(int[] arr){
        if(arr.length<=1) return arr;
        for(int i=1;i<arr.length;i++){
            int  key=arr[i];
            int j=i-1;
            int loc=binarySearch(arr,key,0,j);
            while(j>=loc){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;


        }
        return arr;
    }

        static int binarySearch(int[] arr,int n,int low, int high){
            while(low <=high){
                int mid=(low+high)/2;
                if(n==arr[mid]) return mid;
                else if (n>arr[mid]) {
                    low =mid+1;

                }else high=mid-1;
            }
            return low;        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements you want to sort : ");
        int n =sc.nextInt();
        int[] arr =new int[n];
        for(int i= 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(insertionSortBinary(arr)));

    }}

