//415 - Addition of Strings

import java.util.*;
class Solution{
    public String addStrings(String num1, String num2) {
        StringBuilder result=new StringBuilder(); //Creating new String Builder
        int c=0, i=num1.length()-1, j=num2.length()-1, dig1, dig2, sum; //Declaring all variables
        while(i>=0 || j>=0 || c!=0){
            dig1=(i>=0)?num1.charAt(i--)-'0':0; //Iterates from length-1 and take ASCII values of char and subtract '0'
            dig2=(j>=0)?num2.charAt(j--)-'0':0; //Iterates from length-1 and take ASCII values of char and subtract '0'
            sum=dig1+dig2+c;
            c=sum/10; //stores carry if present
            result.append(sum%10); //Appends in result string
        }
        return result.reverse().toString(); //Reverses and returns the answer
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        Scanner s=new Scanner(System.in);
        System.out.println("num 1 = ");
        String s1=s.nextLine();
        System.out.println("num 2 = ");
        String s2=s.nextLine();
        System.out.println(sol.addStrings(s1,s2));
        s.close();
    }
}
