//Easy 03 *
import java.util.*;
class Username_03{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter username: ");
        str1=s.nextLine();
        System.out.println("Re-Enter username: ");
        str2=s.nextLine();
        if(str1.equals(str2)){
            System.out.println("Username is valid!!");
        }
        else{
            System.out.println("Username is not valid!!");
        }
    }
}
