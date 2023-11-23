//HARD-1
//No of Days into Years, Months, Weeks
import java.util.*;
class DaystoYearsWeeksDays_01{
public static void main(String[] args){
int n, years, years1, weeks, weeks1, days;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of days: ");
n=s.nextInt();
years=n/365;
years1=n%365;
weeks=years1/7;
weeks1=years1%7;
days=weeks1;
System.out.println("No of years is :"+years);
System.out.println("No of weeks is :"+weeks);
System.out.println("No of days is :"+days);
}
}
