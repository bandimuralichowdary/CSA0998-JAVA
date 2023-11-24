//HARD-8
//Displaying Account Balance
import java.util.*;
class BA{
String name;
int accno, amount, withdraw, balance=10000;
char type;
Scanner s=new Scanner(System.in);
void get(){
System.out.println("Enter account holder name: ");
name=s.nextLine();
System.out.println("Enter the acc no : ");
accno=s.nextInt();
System.out.println("Enter account type : S/C");
type=s.next().charAt(0);
if((type=='S')||(type=='s')||(type=='C')||(type=='c')){
System.out.println("Account type accepted!");
}
else{
System.out.println("Account type not valid!!");
}
}
void balance(){
System.out.println("Enter amount to deposit: ");
amount=s.nextInt();
balance=balance+amount;
}
void withdraw(){
if(balance>500){
System.out.println("Enter the amount to withdraw: ");
withdraw=s.nextInt();
balance=balance-withdraw;
System.out.println("Account Holder: "+name);
System.out.println("Account Number: "+accno);
if((type=='s')||(type=='S')){
System.out.println("Account Type: Savings Account");
}
else if((type=='c')||(type=='C')){
System.out.println("Account Type: Current Account");
}
System.out.println("Available balance is: "+balance);
}
else{
System.out.println("You cannot withdraw amount "+balance+" rupees remaining");
}
}
}
class AccBalance_08{
public static void main(String[] args){
try{
BA obj=new BA();
obj.get();
obj.balance();
obj.withdraw();
}
catch(Exception e){
System.out.println("Enter valid details!!");
}
}
}
