//Factorial of a number

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        int fact;
        System.out.print("Enter the number to find factorial:");
        n=s.nextInt();
        fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.printf("The factorial of given number %d is %d\n",n,fact);
    }
}
