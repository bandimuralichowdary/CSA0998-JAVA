//EASY-19
//Increasing, decreasing 1's 
import java.util.*;
class IncDec1_19{
public static void main(String[] args){
int i, j, row;
char ch;
Scanner s=new Scanner(System.in);
System.out.println("Enter any Character: ");
ch=s.next().charAt(0);
System.out.println("Maximum number of time printed: ");
row=s.nextInt();
for(i=0; i<row; i++){
for(j=i; j>=0; j--){
System.out.print(ch+" ");
}
System.out.print("\n");
}
for(i=0; i<(row-1); i++){
for(j=(row-1); j>i; j--){
System.out.print(ch+" ");
}
System.out.print("\n");
}
}
}
