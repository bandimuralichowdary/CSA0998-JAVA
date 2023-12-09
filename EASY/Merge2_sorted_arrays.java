//EASY-13
//Merge 2 Sorted Arrays
import java.util.*;
class Merge2SortedArrays_13{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a1[]={1,2,3,4};
int a2[]={2,3,5,4};
Arrays.sort(a1);
Arrays.sort(a2);
ArrayList<Integer> list=new ArrayList<Integer>();
int i=0, j=0;
while(i<a1.length&&j<a2.length){
if(a1[i]<a2[j]){
list.add(a1[i]);
i++;
}
else{
list.add(a2[j]);
j++;
}
}
while(i<a1.length){
list.add(a1[i]);
i++;
}
while(j<a2.length){
list.add(a2[j]);
j++;
}
System.out.println(list);
}
}
