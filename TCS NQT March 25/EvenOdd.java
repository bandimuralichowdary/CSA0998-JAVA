import java.util.Scanner;
class EvenOdd{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=s.nextInt();
if(n>=0){
if(n%2==0){
System.out.println("Even Number");
}
else{
System.out.println("Odd Number");
}
}
else{
System.out.println("Enter only Positive Numbers");
}
s.close();
}
}