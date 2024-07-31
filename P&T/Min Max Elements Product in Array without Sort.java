//815792
import java.util.Scanner;
public class MinMaxElementsProductinArraywithoutSort{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int arr[]={8,1,5,7,9,2};
        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstmax){
                secondmax=firstmax;
                firstmax=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]<firstmax){
                secondmax=arr[i];
            }
        }
        int product = firstmax*secondmax;
        System.out.println(product);
    }
}

/* CAN BE USED FOR GETTING INPUTS
 import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        System.out.println("Enter the length of array: ");
        int n=s.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstmax){
                secondmax=firstmax;
                firstmax=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]<firstmax){
                secondmax=arr[i];
            }
        }
        int product = firstmax*secondmax;
        System.out.println(product);
    }
}
 */
