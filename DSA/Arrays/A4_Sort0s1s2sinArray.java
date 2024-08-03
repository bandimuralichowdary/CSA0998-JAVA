//ARRAY - 4
//Sort 0s, 1s and 2s
import java.util.*;
import java.util.Arrays;
public class A4_Sort0s1s2sinArray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=s.nextInt();
        System.out.println("Enter only 0s, 1s and 2s in array");
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
            if(a[i]==0||a[i]==1||a[i]==2){
                a[i]=a[i];
            }
            else{
                System.out.println("Only enter 0s 1s 2s");
                a[i]=s.nextInt();
            }
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        s.close();
    }
}

//OR

/*ARRAY - 4
//Sort 0s, 1s and 2s
import java.util.*;
import java.util.Arrays;
public class Practice{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=s.nextInt();
        System.out.println("Enter only 0s, 1s and 2s in array");
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
            while(a[i]!=0 && a[i]!=1 && a[i]!=2){
                System.out.println("Enter only 0s 1s 2s\n Re-Enter the number: ");
                a[i]=s.nextInt();
            }
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        s.close();
    }
}*/
