//MEDIUM-05
//Decimal to Binary, Octal
import java.util.*;
class DectoBinOct_05{
public static void main(String[] args){
int num;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Decimal Number: ");
num=s.nextInt();
String bin=Integer.toBinaryString(num);
System.out.println("Equivalent Binary is:"+bin);
String oct=Integer.toOctalString(num);
System.out.println("Equivalent Octal is:"+oct);
}
}
