//Easy 10 *
import java.util.*;
class RemovingVowelsfromString_10 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter a String: ");
        str1=s.nextLine();
        str2=str1.replaceAll("[aeiouAEIOU]"," ");
        System.out.println("The final string is: \n"+str2);
    }
}
