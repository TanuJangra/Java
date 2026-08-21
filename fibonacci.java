import java.util.Scanner;

class fibonacci {
   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("give your number: ");
        int j= input.nextInt();
        System.out.println("Fibonacci of "+ j+" "+ "= "+fibonacciOf(j) );
        input.close();
    }
    public static  int fibonacciOf(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        int a = 0;
    int b = 1;

    for (int i = 2; i <= n; i++) {
        int c = a + b;
        a = b;
        b = c;
    }

    return b;
        // return(fibonacciOf(n-1)+ fibonacciOf(n-2));
    }
}