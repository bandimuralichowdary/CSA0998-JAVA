import java.util.Scanner;
class PowerofXN{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
double n=s.nextDouble();
System.out.print("Enter a power: ");
double p=s.nextDouble();
System.out.println(Math.pow(n,p));
s.close();
}
}