import java.util.Scanner;

public class primeNum {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Give a number: ");
    int j=input.nextInt();
    boolean isPrime=true;
    if(j<2){
        isPrime=false;
    }else{
        for(int i=2;i*i<=j;i++){
            if(j%i==0){
                isPrime= false;
                break;
            }
        }
    }
    
    if(isPrime){
        System.out.println("This is a prime number.");
        
    }else{
        System.out.println("This is not a prime number.");
    }
    input.close();
   } 
}
