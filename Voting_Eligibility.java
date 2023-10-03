//Voting Eligibility

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age,elg;
        System.out.println("Enter your birth year:");
        age=s.nextInt();
        elg=18-age;
        if(age<=0)
        {
            System.out.println("Enter a valid AGE\n");
        }
        if(age<18)
        {
            System.out.println("You are not eligible for voting");
            System.out.printf("You will be eligible after %d years\n",elg);
        }
        else
        {
            System.out.println("You are eligible for Voting\n");
        }
    }
}
