import java.util.Scanner;
class Fibonacci{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n, a=0, b=1, c;
System.out.println("Enter the number of terms: ");
n=sc.nextInt();
System.out.print("Fibonacci series: ");
System.out.println(a+","+b+",");
for(int i=2; i<n; i++){
c=a+b;
System.out.print(","+c);
a=b;
b=c;
}
}
}