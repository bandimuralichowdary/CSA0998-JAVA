import java.util.*;
class Fibonacci{
public static void main(String[] args){
int a=0, b=1, c, n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of terms in fibonacci series: ");
n=s.nextInt();
System.out.println("Fibonacci Series is : \n"+a+"\n"+b);
for(int i=2;i<n;i++){
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
