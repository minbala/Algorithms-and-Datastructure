import java.util.Scanner;

public class BinarySearchRecur {
    static int binarySearchRecur(int[] arr,int n,int low, int high){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(n ==arr[mid]) return mid;
        else if (n>arr[mid]) {
            return binarySearchRecur(arr,n,mid+1,high);
            
        }else return binarySearchRecur(arr,n,low,mid-1);

    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number u want to search : ");
        int number =sc.nextInt();
        System.out.print("Enter the number of elements in array : ");
        int size =sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        int index= binarySearchRecur(arr,number,0,size);
        if(index ==-1)System.out.println("Number not found in array");
        else System.out.println("Number found at index "+index);

    }
}
