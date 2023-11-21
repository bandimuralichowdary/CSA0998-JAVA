//EASY-15
//Count Composite
import java.util.*;
class Composite_15{
public static void main(String[] args){
int size, p_count=0, c_count=0, arr[];
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array: ");
size=s.nextInt();
arr=new int[size];
System.out.printf("Enter %d elements in the array: ",size);
for(int i=0; i<size; i++){
arr[i]=s.nextInt();
int count=0;
if(arr[i]==1){
System.out.println("1 is neither prime nor composite!!");
}
else if(arr[i]>1){
for(int k=1; k<=arr[i]; k++){
if(arr[i]%k==0){
count++;
}
}
if(count>2){
c_count++;
}
else{
p_count++;
}
}
}
System.out.println("Prime number count is : "+p_count);
System.out.println("Composite number count is : "+c_count);
}
}
