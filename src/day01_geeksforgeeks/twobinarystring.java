package day01_geeksforgeeks;
import java.util.*;
public class twobinarystring {

    static String addbinary(String a, String b) {
        int num1= Integer.parseInt(a,2);
        int num2= Integer.parseInt(b,2);
        int sum = num1+num2;

        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string a");
        String a = in.nextLine();
        System.out.println("Enter the string b");
        String b = in.nextLine();
        String result = addbinary(a,b);
        System.out.println(result);
    }
}
