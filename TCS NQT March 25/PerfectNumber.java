import java.util.Scanner;
class PerfectNumber{
static boolean Isperfect(int  n){
int sum=0;
if(n<=0){
System.out.println("Enter a valid Positive Integer");
}
else{
for(int i=1; i<=n/2; i++){
if(n%i==0){
sum+=i;
}
}
}
return sum==n;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=s.nextInt();
System.out.println(Isperfect(n));
s.close();
}
}