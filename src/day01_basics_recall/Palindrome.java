package day01_basics_recall;
import java.util.Scanner;

public class Palindrome
{
    public static void main (String [] args){

        Scanner in = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        int s = in.nextInt();
        int temp = s;
        int rev=0;
        int rem;
        while(s!=0){
            rem=s%10;
            rev=(rev*10)+rem;
            s=s/10;

        }
        System.out.println (rev);
        if(temp==rev){
            System.out.println ("It is a palindrome.");
        }
        else{
            System.out.println ("It is not a palindrome.");
        }
    }
}
