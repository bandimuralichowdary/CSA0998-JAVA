import java.util.*;
class SimpleInterest{
public static void main(String[] args){
int p, t, r, si;
Scanner s=new Scanner(System.in);
System.out.println("Enter Principle Amount: ");
p=s.nextInt();
System.out.println("Enter Time Period: ");
t=s.nextInt();
char type;
System.out.println("Enter senior citizen or not: (y/n)");
type=s.next().charAt(0);
if(type=='y'||type=='Y'){
si=(p*t*12)/100;
System.out.println("Simple Interest is :"+si);
}
else if(type=='n'||type=='N'){
si=(p*t*10)/100;
System.out.println("Simple Interest is :"+si);
}
else{
System.out.println("Enter a valid category!!");
}
}
}
