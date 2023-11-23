//HARD-4
//Nth Prime
import java.util.*;
class NthPrimeNo_04{
public static void main(String[] args){
int n, fact, count=0, nth;
Scanner s=new Scanner(System.in);
System.out.println("Enter the range: ");
n=s.nextInt();
System.out.println("Enter the nth term: ");
nth=s.nextInt();
for(int i=1; i<=n; i++){
fact=0;
for(int j=1; j<=i; j++){
if(i%j==0){
fact=fact+1;
}
}
if(fact==2){
count=count+1;
System.out.println(i+" is a prime number.");
}
if(count==nth){
System.out.println(nth+"th prime is: "+i);
break;
}
}
}
}
