//ARRAY - 5
//Union and Intersection of 2 arrays
import java.util.*;
public class A6_UnionIntersectioninArrays {
    public static int union(int[] a1, int[] a2){
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0; i<a1.length; i++){
            arr.add(a1[i]);
        }
        for(int i=0; i<a2.length; i++){
            arr.add(a2[i]);
        }
        System.out.println("Union is: "+arr);
        System.out.print("Count: ");
        return arr.size();
    }
    public static int intersection(int[] a1, int[] a2){
        int c=0;
        System.out.print("Common elements are: ");
        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a2.length; j++){
                if(a1[i]==a2[j]){
                    System.out.print(a1[i]+" ");
                    c++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.print("Count: ");
        return c;
    }
    public static void main(String[] args){
        int[] a1={1,2,3,4,5};
        int[] a2={2,6};
        System.out.println(union(a1, a2));
        System.out.println(intersection(a1, a2));
    }
}
