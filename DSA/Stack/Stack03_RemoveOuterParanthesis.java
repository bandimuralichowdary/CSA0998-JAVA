import java.util.*;
public class Stack03_RemoveOuterParanthesis{
    public static String removeOuterParanthesis(String s){
        int l=s.length();
        if(l<=2) return "";
        char[] ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int open=1;
        for(int i=1; i<l; i++){
            if(ch[i]=='('){
                open++;
                if(open>1) sb.append('(');
            }
            else{
                if(open>1) sb.append(')');
                open--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(removeOuterParanthesis(str));
        s.close();
    }
}
