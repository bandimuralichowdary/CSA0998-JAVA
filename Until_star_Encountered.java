//Assignment-4 Q-1
/*Write a java program to read a character until a * is encountered. 
Also count the number of uppercase, lowercase, and numbers entered by the users.
Sample Input:
Enter * to exit…
Enter any character: W
Enter any character: d
Enter any character: A
Enter any character: G
Enter any character: g
Enter any character: H
Enter any character: *
Sample Output:
Total count of lower case:2
Total count of upper case:4
Total count of numbers =0
Test cases:
1.	1,7,6,9,5
2.	S, Q, l, K,7, j, M
3.	M, j, L, &, @, G
4.	D, K, I, 6, L, *
5.	*, K, A, e, 1, 8, %, *
*/

import java.util.*;
class Star{
    char ch;
    int i, cl=0, cu=0, cn=0;
    void get(){
        do{
            System.out.print("Enter any character: ");
            Scanner s=new Scanner(System.in);
            ch=s.next().charAt(0);
            if(ch=='*'){
                System.out.print("'*'-Encountered Exiting Program!!\n");
                break;
            }
            else if(Character.isLowerCase(ch)){
                cl++;
            }
            else if(Character.isUpperCase(ch)){
                cu++;
            }
            else if(Character.isDigit(ch)){
                cn++;
            }
            else{
                System.out.print("Enter a valid Character!!\n");
            }
        }while(true);
    }
    void display(){
        System.out.println("Total count of lower case: "+cl);
        System.out.println("Total count of upper case: "+cu);
        System.out.println("Total count of numbers: "+cn);
    }
}
class Star1{
    public static void main(String[] args){
        Star obj=new Star();
        obj.get();
        obj.display();
    }
}
