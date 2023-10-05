// Java program for Simple Interest using OOPS Argument Passing

import java.util.*;
class SI{
    int p, t, r, intr=0;
    SI(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Principal Amount:");
        p=s.nextInt();
        System.out.print("Enter Time Period:");
        t=s.nextInt();
        System.out.print("Enter the Rate of Interest:");
        r=s.nextInt();
    }
    void intr(){
        intr=(p*t*r)/100;
        System.out.println("The Simple Interest for Principal Amount "+p+" for Time Period "+t+" is : "+intr);
    }
    public static void main(String[] args){
        SI obj=new SI();
        obj.intr();
    }
}
