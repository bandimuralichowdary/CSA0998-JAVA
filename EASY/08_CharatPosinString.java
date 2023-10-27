//Easy 08 *
import java.util.*;
class CharPosinString_08{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        int pos;
        char ch;
        System.out.println("Enter a String: ");
        str=s.nextLine();
        System.out.println("Enter a Character to find: ");
        ch=s.next().charAt(0);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                System.out.println("The character "+ch+" is found at "+(i+1)+" position.");
            }
        }
    }   
}
