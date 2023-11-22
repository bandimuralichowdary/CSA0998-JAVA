//EASY-27
//Inverted Full Pyramid Pattern
import java.util.*;
class InvertedPyramid_27{
public static void main(String[] args){
int rows;
char ch;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of rows: ");
rows=s.nextInt();
System.out.println("Enter the character : ");
ch=s.next().charAt(0);
for(int i=rows; i>=1; i--){
for(int j=0; j<rows-i; j++){
System.out.print(" ");
}
for(int k=0; k!=(2*i)-1; k++){
System.out.print(ch);
}
System.out.println();
}
}
}
