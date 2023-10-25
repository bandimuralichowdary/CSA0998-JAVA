//Easy 05 *
import java.util.*;
class Specialchar_05{
    public static void main(String[] args){
        String input;
        int n=0, a=0, sp=0, len;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter characters in the same line as String: ");
        input=s.nextLine();
        len=input.length();
        char ch[]=input.toCharArray();
        for(int i=0;i<len;i++){{
            if(Character.isDigit(ch[i])){
                n++;
            }
            else if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
                a++;
            }
            else{
                System.out.println(ch[i]);
                sp++;
            }
        }
    }
        System.out.println("Number count is: "+n);
        System.out.println("Alphabets count is: "+a);
        System.out.println("Special characters is: "+sp);
    }
}
