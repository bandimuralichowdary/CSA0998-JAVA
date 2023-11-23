//HARD-3
//Nth Factor Finding
import java.util.*;
class NthFactor_03{
public static void main(String[] args){
int num, n, count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
num=s.nextInt();
System.out.println("Enter the nth factor: ");
n=s.nextInt();
for(int i=1; i<num; i++){
if(num%i==0){
count=count+1;
if(count==n){
System.out.println(n+"th Factor is:"+i);
}
}
}
if(n>count){
System.out.println("Can't find "+n+"th factor");
System.out.println("Only "+count+" factors are possible.");
}
}
}
