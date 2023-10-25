//Easy 02 *
import java.util.*;
class StringToInteger_02{
    public static void main(String[] args){
        String input;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String: ");
        input=s.nextLine();
        try{
            int result=Integer.parseInt(input);
            System.out.println("The output number: "+result);
        }catch(NumberFormatException e){
            System.out.println("The string "+input+" is not a integer!!");
        }
    }
}
