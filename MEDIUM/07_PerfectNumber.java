//MEDIUM-7
//Perfect Number
import java.util.*;
class PerfectNumber_07
{
static boolean  perfect(int num){
int sum=0;
for(int i=1; i<num; i++){
if(num%i==0){
sum=sum+i;
}
}
if(sum==num){
return true;
}
else{
return false;
}
}
public static void main(String[] args){
try{
int n=0, N;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of terms: ");
N=s.nextInt();
if(N<=0){
System.out.println("Enter a positive value!!");
}
else if((N>0)&&(N<=3)){
n=1000;
}
else if((N>3)&&(N<=5)){
n=100000000;
}
else{
System.out.println("Too large value, please enter a value between 1-5");
return;
}
System.out.println("Perfect Numbers are : ");
for(int i=1; i<=n; i++){
if(perfect(i)){
System.out.println(i);
}
}
}
catch(Exception e){
System.out.println("enter the N value correctly");
}
}
}
