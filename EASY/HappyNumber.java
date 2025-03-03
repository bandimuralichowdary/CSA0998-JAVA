import java.util.Scanner;
class HappyNumber{
static boolean IsHappy(int n){
while(n!=1 && n!=4){
int sum=0;
while(n>0){
int rem=n%10;
sum+=rem*rem;
n/=10;
}
n=sum;
}
return n==1;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=s.nextInt();
System.out.println(IsHappy(n));
s.close();
}
}