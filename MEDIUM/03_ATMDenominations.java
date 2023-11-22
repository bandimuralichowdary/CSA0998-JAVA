//MEDIUM-3
//ATM Denominations
import java.util.*;
class ATMDenom_03{
public static void main(String[] args){
int n, notes, amount, balance=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of denominations available: ");
n=s.nextInt();
if(n>4||n<=0){
System.out.println("Enter Valid no of denominations i.e., Between 1-4.");
}
else{
for(int i=1; i<=n; i++){
System.out.println("Enter the "+i+" Denomination Notes:");
notes=s.nextInt();
System.out.println("Enter the "+i+" Denomination Amount:");
amount=s.nextInt();
balance+=(notes*amount);
}
}
System.out.println("Total Available Balance in ATM: "+balance);
}
}
