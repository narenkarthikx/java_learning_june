package day03_basics_arrays;
public class maxelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int max = arr[0];
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
