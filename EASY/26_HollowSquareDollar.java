//EASY-26
//Hollow Square Dollar Pattern
import java.util.*;
class HollowSquareDollar_26{
public static void main(String[] args){
int rows, cols;
char ch;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of rows: ");
rows=s.nextInt();
System.out.println("Enter the no of columns: ");
cols=s.nextInt();
System.out.println("Enter the character: ");
ch=s.next().charAt(0);
for(int i=1; i<=rows; i++){
for(int j=1; j<=cols; j++){
if((i==1||i==rows)||(j==1||j==cols)){
System.out.print(ch+" ");
}
else{
System.out.print("  ");
}
}
System.out.println();
}
}
}
