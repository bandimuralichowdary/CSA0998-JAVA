import java.util.*;
class Factorial{
public static void main(String[] args){
int n, fact=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
n=s.nextInt();
for(int i=1; i<=n; i++){
fact=fact*i;
}
System.out.println("Factorial of "+n+" is "+fact);
}
}
