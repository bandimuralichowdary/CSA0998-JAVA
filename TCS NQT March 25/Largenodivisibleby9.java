import java.util.Scanner;
class Largenodivisibleby9{
static boolean check(String str){
int n=str.length();
int digSum=0;
for(int i=0; i<n; i++){
digSum+=(str.charAt(i)-'0');
}
return (digSum%9==0);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
String str=sc.next();
if(check(str)){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}