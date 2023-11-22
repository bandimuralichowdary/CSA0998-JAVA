//EASY-21
//Increasing Pattern
import java.util.*;
class IncreasingPattern_21{
public static void main(String[] args){
int rows;
char ch;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of rows: ");
rows=s.nextInt();
System.out.println("Enter the character : ");
ch=s.next().charAt(0);
for(int i=0; i<rows; i++){
for(int j=0; j<=i; j++){
System.out.print(ch+" ");
}
System.out.println();
}
}
}
