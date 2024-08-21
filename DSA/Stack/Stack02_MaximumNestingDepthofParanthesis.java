import java.util.*;
import java.lang.Math;
public class Stack02_MaximumNestingDepthofParanthesis{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string with paranthesis: ");
        String str=s.nextLine();
        int curDepth=0, maxDepth=0;
        char[] ch=str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='('){
                curDepth++;
                maxDepth=Math.max(curDepth, maxDepth);
            }
            else if(ch[i]==')'){
                curDepth--;
            }
        }
        System.out.println(maxDepth);
        s.close();
    }
}
