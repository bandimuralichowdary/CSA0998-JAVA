import java.util.Scanner;
class FloatingpointEvenOdd{
static boolean isEven(String s, int n){
n=s.length();
int check=-1;
for(int i=n-1; i>=0; i--){
if(Character.getNumericValue(s.charAt(i))==0||s.charAt(i)=='.'){
continue;
}
else{
check=Character.getNumericValue(s.charAt(i));
break;
}
}
return (check%2==0);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
String s=sc.nextLine();
int n=s.length();
if(isEven(s,n)){
System.out.println("Even");
}
else{
System.out.println("Odd");
}
sc.close();
}
}