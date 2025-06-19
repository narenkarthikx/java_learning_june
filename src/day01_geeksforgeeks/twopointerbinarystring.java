package day01_geeksforgeeks;
import java.util.*;
public class twopointerbinarystring {
    public static String addstring(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 ||carry==1) {
            int sum= carry;
            if(i>=0)
            {sum+=a.charAt(i)-'0';
            i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first binary string");
        String a = sc.nextLine();
        System.out.println("Enter the second binary string");
        String b = sc.nextLine();
        String res = addstring(a,b);
        System.out.println(res);
    }
}
