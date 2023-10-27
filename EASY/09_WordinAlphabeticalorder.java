//Easy 09 *
import java.util.*;
class WordinReverse_09{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str;
        int i=0, j;
        char temp;
        System.out.println("Enter a word: ");
        str=s.nextLine();
        char arr[]=str.toCharArray();
        while(i<arr.length){
            j=i+1;
            while(j<arr.length){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j+=1;
            }
            i+=1;
        }
        System.out.println("After alphabetical sort: ");
        System.out.println(arr);
    }
}
