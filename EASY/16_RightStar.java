//EASY-16
//Right Star Triangle
import java.util.*;
import java.io.*;
class RightStar_16{
public static void main(String[] args){
int n,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
n=s.nextInt();
for(i=0;i<n;i++){
for(j=2*(n-i);j>=0;j--){
System.out.print(" ");
}
for(j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}
}
}
