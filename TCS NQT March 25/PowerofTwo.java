import java.util.Scanner;
class PowerofTwo{
static boolean IsPowerofTwo(int n){
if(n<0){
System.out.println("Enter a Positive Number");
}
else{
for(int i=0;i<n;i++){
if(n==Math.pow(2,i)){
return true;
}
}
}
return false;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=s.nextInt();
System.out.println(IsPowerofTwo(n));
s.close();
}
}