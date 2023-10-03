//Fibonacci Series

import java.util.*;
class MyProgram{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.print("Enter the number of terms in series:");
        n=s.nextInt();
        System.out.print("Fibonacci Series: ");
        System.out.println(a+","+b+",");
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
        }
    }
}
