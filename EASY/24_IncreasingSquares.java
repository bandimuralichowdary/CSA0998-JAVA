//EASY-24
//Increasing Numbers Square Pattern
import java.util.*;
class IncreasingSquares_24{
public static void main(String[] args){
int rows, n=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of rows: ");
rows=s.nextInt();
for(int i=1; i<=rows; i++){
for(int j=1; j<=i; j++){
System.out.print(n*n+" ");
n=n+1;
}
System.out.println();
}
}
}
