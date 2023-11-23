//HARD-5
// Perfect Squares whose digits sum is 10.
import java.util.*;
class PerfectSquare_05
{
public static void main(String[] args){
int ln, un;
Scanner s=new Scanner(System.in);
System.out.println("Enter lower range: ");
ln=s.nextInt();
System.out.println("Enter upper range: ");
un=s.nextInt();
int d1, d2, c;
for(int i=ln; i<=un; i++){
for(int j=ln; j<=un; j++){
if(j==(i*i)){
d1=j%10;
d2=j/10;
c=d1+d2;
if(c<10){
System.out.println(j);
}
}
}
}
}
}
