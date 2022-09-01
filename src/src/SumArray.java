import java.util.Scanner;

public class SumArray {
     static int sumArray(int[] array ){
        int sum =0;
        for(int i:array){
            sum+=i;
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of elements u want to sum : ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(sumArray(arr));

    }
}
