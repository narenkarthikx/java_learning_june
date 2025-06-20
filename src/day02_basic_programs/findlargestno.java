package day02_basic_programs;

public class findlargestno {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;
        int largest = Math.max(Math.max(num1, num2), num3);

        System.out.println("The largest number is: " + largest);
    }
}