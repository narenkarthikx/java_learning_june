package day02_basic_programs;
import java.util.*;

public class reverseno {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num = sc.nextInt();
        int reverseno = 0;
        while(num!=0){
            int remainder=num%10;
            reverseno=reverseno*10+remainder;
            num=num/10;
        }
        System.out.println("The reverseno is: " + reverseno);
    }
}
