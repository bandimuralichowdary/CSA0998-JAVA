//HARD-2
//Total no of Student Users
import java.util.*;
class NoofStudentUsers_02{
public static void main(String[] args){
int total, staff, non, student;
Scanner s=new Scanner(System.in);
System.out.println("Enter the total users: ");
total=s.nextInt();
System.out.println("Enter staff users: ");
staff=s.nextInt();
non=staff/3;
System.out.println("Non Teaching Staff are: "+non);
student=(total-staff-non);
System.out.println("Total Student users are: "+student);
}
}
