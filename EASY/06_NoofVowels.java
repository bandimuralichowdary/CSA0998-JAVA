//Easy 06 *
import java.util.*;
class NoofVowels_06 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String line;
        int vc=0, cc=0;
        System.out.println("Enter any sentence: ");
        line=s.nextLine();
        int len=line.length();
        char[] ch=line.toCharArray();
        for(int i=0; i<len; i++){
            if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U'){
                vc++;
                System.out.println(ch[i]);
            }
        }
        System.out.println("Vowel count = "+vc);
    }
}
