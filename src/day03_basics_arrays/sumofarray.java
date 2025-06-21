package day03_basics_arrays;

public class sumofarray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for(int num: arr){
            sum+=num;
        }
        System.out.println(sum);
    }
}
