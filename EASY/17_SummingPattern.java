//EASY-17
//Summing Pattern 
import java.util.*;
class SummingPattern_17{
public static void main(String[] args){
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
n=s.nextInt();
for(int i=0;i<n;i++){
for(int j=0; j<n-i-1; j++){
System.out.print("\t");
}
int value=1;
for(int j=0; j<=i;j++){
System.out.print(value+"\t\t");
value=value*(i-j)/(j+1);
}
System.out.println();
}
}
}
