//Leap Year or not

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year;
        System.out.println("Enter the year number:");
        year=s.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0)
        {
            System.out.printf("The given year %d is a leap year\n",year);
        }
        else
        {
            System.out.printf("The given year %d is not a leap year\n",year);
        }
    }
}
