//EASY-25
//Increasing, Decreasing Numbers
import java.util.*;
class IncDecnum_25{
public static void main(String[] args){
int rows;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of rows: ");
rows=s.nextInt();
for(int i=1; i<=rows; i++){
for(int j=1; j<=i; j++){
System.out.print(i+" ");
}
System.out.println();
}
for(int i=(rows-1); i>=1; i--){
for(int j=1; j<=i; j++){
System.out.print(i+" ");
}
System.out.println();
}
}
}
