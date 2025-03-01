import java.util.Scanner;
class SumofFibonacci{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n, a=0, b=1, c, sum=0;
System.out.println("Enter the no of terms: ");
n=sc.nextInt();
if(n<=0){
sum=a;
}
else if(n==1){
sum=a+b;
}
else{
sum=a+b;
for(int i=2; i<=n; i++){
c=a+b;
sum+=c;
a=b;
b=c;
}
}
System.out.println(sum);
}
}