import java.util.Scanner;//import scanner calss to read user input

public class calculator {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    System.out.println("give me your first number : ");
    int i=input.nextInt();

    System.out.println("choose an operator(+,-,*,/)");// input arithmetic operator
    char operator=input.next().charAt(0);

    System.out.println("give me your second number: ");
    int j=input.nextInt();

    double result;
    switch(operator){
        case '+':
            result=i+j;
            break;
        
        case '-':
             result=i-j;
             break;
        case'*' :
             result=i*j;
             break;

        case'/':
            if(j==0){
                System.out.println("Error: Division by zero is not allowed.");
                input.close();
                return;
            }
        result=i/j;
        break;

        default: 
            System.out.println("Invalid operator entered.");
            input.close();
            return;
    }

System.out.println(" Result: "+ i +" "+ operator+ " "+ j+ " "+ "="+" "+ result);
input.close();
   } 
}
