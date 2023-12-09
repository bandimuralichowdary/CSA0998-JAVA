import java.util.*;
class Voting{
public static void main(String[] args){
int age;
Scanner s=new Scanner(System.in);
System.out.println("Enter your age: ");
age=s.nextInt();
if(age>=18){
System.out.println("You are eligible for voting!!");
}
else if(age<18){
System.out.println("You are not eligible for voting!!\n");
System.out.println("You'll be eligible after "+(18-age)+" years");
}
}
}
