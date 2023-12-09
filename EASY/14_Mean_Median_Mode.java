//Easy 14 *
import java.util.*;
class MeanMedianMode_14{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int size, sum=0;
        System.out.println("Enter the size of array: ");
        size=s.nextInt();
        float arr[]=new float[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=s.nextFloat();
            sum+=arr[i];
        }
        float temp;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        float max=0;
        int n_count=0, o_count=0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i]==arr[j]){
                    n_count++;
                }
            }
            if(o_count<n_count){
                max=arr[i];
                o_count=n_count;
            }
            n_count=0;
        }
        System.out.println("MEAN is: "+(int)(sum/size));
        if(size%2==0){
            System.out.println("MEDIAN is: "+(int)((arr[size/2]+arr[size/2+1])/2));
        }
        else{
            System.out.println("MEDIAN is: "+(int)(arr[size/2]));
        }
        System.out.println("MODE is: "+(int)max);
    }
}
