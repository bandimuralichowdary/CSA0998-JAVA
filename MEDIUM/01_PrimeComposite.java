//MEDIUM-1
//Count all the prime and composite numbers
import java.util.*;
class PrimeComposite_01{
public static void main(String[] args){
int n, a[];
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of array elements : ");
n=s.nextInt();
a=new int[n];
System.out.println("Enter the array elements : ");
int prime=0, composite=0;
for(int i=0; i<n; i++){
a[i]=s.nextInt();
int count=0;
if(a[i]==1){
System.out.println("1 is neither prime nor composite!!");
}
else if(a[i]>1){
for(int j=1; j<100; j++){
if(a[i]%j==0){
count++;
}
}
if(count>2){
composite++;
}
else{
prime++;
}
}
}
System.out.println("Composite numbers count:"+composite);
System.out.println("Prime numbers count:"+prime);
}
}
