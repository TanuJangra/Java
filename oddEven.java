import java.util.Scanner;

public class oddEven {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Give your number: ");
    Double i=input.nextDouble();
    if(i%2==0){
        System.out.println(i+" is an even number.");
    }else
        System.out.println(i+" is an odd number.");
    input.close();
   } 
}
