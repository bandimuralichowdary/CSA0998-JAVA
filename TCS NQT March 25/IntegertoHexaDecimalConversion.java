import java.util.Scanner;
class IntegertoHexaDecimalConversion{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=s.nextInt();
System.out.println(Integer.toHexString(n));
s.close();
}
}