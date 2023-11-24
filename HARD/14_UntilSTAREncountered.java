//HARD-14
//Until*Encountered
import java.util.*;
class UntilSTAREncountered_14{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
char[] ch=new char[100];
int digit=0, upper=0, lower=0;
System.out.println("Enter the elements 1 by one: ");
for(int i=0; i<100; i++){
System.out.println("Enter character: ");
ch[i]=s.next().charAt(0);
if(Character.isUpperCase(ch[i])){
upper++;
}
else if(Character.isLowerCase(ch[i])){
lower++;
}
else if(Character.isDigit(ch[i])){
digit++;
}
if(ch[i]=='*'){
System.out.println("* encountered exiting program!!");
break;
}
}
System.out.println("Upper case letter count: "+upper);
System.out.println("Lower case letter count: "+lower);
System.out.println("Digit count is:"+digit);
}
}
