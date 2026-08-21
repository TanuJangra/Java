import java.util.Scanner;

public class swapTwoNumbers {
   public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("First Number: ");
    int i=input.nextInt();
    System.out.println("Second Number: ");
    int j= input.nextInt();
    int temp=i;
    i=j;
    j=temp;
    System.out.println("First Number: " + i +" "+ " Second Number: "+" "+ j);
    input.close();// close the Scannre class to prevent memory
   } 
}
