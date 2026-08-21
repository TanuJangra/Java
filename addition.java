import java.util.Scanner;// Import the Scanner class to read user input

public class addition {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Give me your first number: ");
    int i=input.nextInt();
    System.out.println("Give your second number: ");
    int j=input.nextInt();

    System.out.println("Addition: "+ (i+j));
    input.close(); // Close the scanner to prevent memory leaks
   } 
}