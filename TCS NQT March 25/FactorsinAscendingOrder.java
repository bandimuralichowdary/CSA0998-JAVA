import java.util.Scanner;
class FactorsinAscendingOrder{
static void PrintFactors(int n){
for(int i=1; i<=n; i++){
if(n%i==0){
System.out.print(i+" ");
}
}
System.out.println();
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=s.nextInt();
PrintFactors(n);
s.close();
}
}