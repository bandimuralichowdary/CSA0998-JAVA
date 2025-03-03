import java.util.Scanner;
class ClimbingStairs{
static int NoofWays(int n){
if(n>0 && n<=2){
return 2;
}
int a=1, b=2;
for(int i=3; i<=n; i++){
int temp=a+b;
a=b;
b=temp;
}
return b;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of stairs: ");
int n=s.nextInt();
System.out.println("No of ways to climb are: "+NoofWays(n));
s.close();
}
}