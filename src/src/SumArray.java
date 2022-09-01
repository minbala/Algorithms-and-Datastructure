

public class SumArray {
     static int sumArray(int[] array ){
        int sum =0;
        for(int i:array){
            sum+=i;
        }
        return sum;
    }

    static double sumArray(double[] array ){
        int sum =0;
        for(double i:array){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        double sum =sumArray(new double[]{2.4,3,4});
        System.out.println(sum);

    }
}
