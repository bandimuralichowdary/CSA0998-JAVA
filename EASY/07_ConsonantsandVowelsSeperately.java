//Easy 07 *
import java.util.*;
class ConsonantsandVowelsSeperately_07 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String line;
        int vc=0, cc=0;
        System.out.println("Enter any sentence: ");
        line=s.nextLine();
        int len=line.length();
        char[] ch=line.toCharArray();
        System.out.println("Vowels are: ");
        for(int i=0; i<len; i++){
            if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U'){
                vc++;
                System.out.println(ch[i]);
            }
        }
        System.out.println("Vowel count = "+vc);
        System.out.println("Consonants are: ");
        for(int i=0; i<len; i++){
            char ca=Character.toLowerCase(ch[i]);
            if((ca>='a'&&ca<='z'&&ca!='a'&&ca!='e'&&ca!='i'&&ca!='o'&&ca!='u')){
                cc++;
                System.out.println(ch[i]);
            }
        }
        System.out.println("Consonants count = "+cc);
    }
}
