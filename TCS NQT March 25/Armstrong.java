import java.util.Scanner;
class Armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n, temp, r, sum=0;
System.out.print("Enter the number: ");
n=sc.nextInt();
temp=n;
while(n>0){
r=n%10;
n=n/10;
sum=sum+r*r*r;
}
if(temp==sum){
System.out.println("\nThe number is Armstrong Number!");
}
else{
System.out.println("\nThe number is Not Armstrong Number!");
}
}
}