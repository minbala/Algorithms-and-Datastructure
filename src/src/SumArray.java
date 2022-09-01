

public class SumArray {
     static int sumarray(int[] array ){
        int sum =0;
        for(int i:array){
            sum+=i;
        }
        return sum;
    }

    static double sumarray(double[] array ){
        int sum =0;
        for(double i:array){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        double sum =sumarray(new double[]{2.4,3,4});
        System.out.println(sum);

    }
}
