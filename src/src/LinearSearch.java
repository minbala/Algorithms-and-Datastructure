import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int n,int[] arr){
        for(int i =0;i<arr.length;i++){
            if(n == arr[i]) return i;
        }
        return  -1;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number u want to search : ");
        int number =sc.nextInt();
        System.out.print("Enter the number of elements in array : ");
        int size =sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        int index= linearSearch(number,arr);
        if(index ==-1)System.out.println("Number not found in array");
        else System.out.println("Number found at index "+index);

}}
