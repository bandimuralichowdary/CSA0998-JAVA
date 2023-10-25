//Easy 01 *
import java.util.*;
class ReverseaWord_01{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String inputString, reversedString;
        System.out.println("Enter the input string: ");
        inputString=s.nextLine();
        reversedString=reverseaString(inputString);
        System.out.println("The Reversed String is: "+reversedString);
    }
    public static String reverseaString(String input){
        char[] charArr=input.toCharArray();
        int start=0;
        int end=input.length()-1;
        while(start<end){
            char temp=charArr[start];
            charArr[start]=charArr[end];
            charArr[end]=temp;
            start++;
            end--;
        }
        return new String(charArr);
    }
}
