package day01_basics_recall;

public class  Forloop {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();  // Moves to the next line after printing a space
        }
    }
}
