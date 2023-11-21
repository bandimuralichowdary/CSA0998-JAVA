//EASY-18
//Rectangle pattern
import java.util.*;
class RectanglePattern_18{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
char c;
int m, n;
System.out.print("Enter Rows:");
m=s.nextInt();
System.out.print("Enter Columns:");
n=s.nextInt();
System.out.println("Enter the character: ");
c=s.next().charAt(0);
for(int i=0; i<m; i++){
for(int j=0; j<n; j++){
System.out.print(c);
}
System.out.println();
}
}
}
