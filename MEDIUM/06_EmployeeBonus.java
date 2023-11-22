//MEDIUM-06
//Employees Grades and Bonus
import java.util.*;
class EmployeeBonus_06{
public static void main(String[] args){
double Salary, Bonus, EBonus, OSalary;
char Grade;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Salary : ");
Salary=s.nextDouble();
System.out.println("Enter the Grade of the Employee: ");
Grade=s.next().charAt(0);
OSalary=Salary;
if(Grade=='A'){
Bonus=0.05;
Salary=Salary+(Salary*0.05);
if(Salary<10000){
EBonus=0.02;
Salary=Salary+(EBonus*Salary);
}
}
else if(Grade=='B'){
Bonus=0.10;
Salary=Salary+(Salary*0.10);
if(Salary<10000){
EBonus=0.02;Salary=Salary+(EBonus*Salary);
}
}
else{
System.out.println("Enter a valid grade i.e., Grade A or Grade B");
}
System.out.println("Salary is : "+OSalary);
System.out.println("Salary With Bonus is : "+Salary);
}
}
