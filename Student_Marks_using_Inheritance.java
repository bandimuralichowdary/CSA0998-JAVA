// Assignment-3 Q-1
/*Write a Java program to enter the marks of a student in four subjects. 
Then calculate the total and aggregate, and display the grade obtained by the student. 
If the student scores an aggregate greater than 75%, then the grade is Distinction. 
If the aggregate is 60>= and <75, then the grade is First Division. 
If the aggregate is 50 >= and <60, then the grade is Second Division. 
If the aggregate is 40>= and <50, then the grade is Third Division, else the grade is Fail. Using Multilevel inheritance concept.
Sample Input & Output:
Enter the marks in python: 90
Enter the marks in c programming: 91
Enter the marks in Mathematics: 92
Enter the marks in Physics: 93
Total= 366
Aggregate = 91.5
DISTINCTION
Test cases:
a)	18, 76,93,65
b)	73,78,79,75
c)	98,106,120,95
d)	96,73, -85,95
e)	78,59.8,76,79
*/

import java.util.*;
class Marks{
    private int S1, S2, S3, S4;
    protected int total=0;
    void getmarks(int A, int B, int C, int D){
        S1=A;
        S2=B;
        S3=C;
        S4=D;
    }
    void caltotal(){
        int sum=S1+S2+S3+S4;
        total = total+sum;
    }
}
class Aggregate extends Marks{
    protected double aggregate;
    void calaggregate(){
        aggregate=(total/4);
    }
}
class Grade extends Aggregate{
    void calgrade(){
        if(aggregate>75){
            System.out.print("You Scored DISTINCTION.\n");
            System.out.print("CONGRATULATIONS!!");
        }
        else if(aggregate>=60 && aggregate<75){
            System.out.print("You scored FIRST DIVISION.");
        }
        else if(aggregate>=50 && aggregate<60){
            System.out.print("You scored SECOND DIVISION.");
        }
        else if(aggregate>=40 && aggregate<50){
            System.out.print("You scored THIRD DIVISION.");
        }
        else if(aggregate>=0 && aggregate<40){
            System.out.print("You have FAILED in Exams.");
            System.out.print("Improve your Grades!!");
        }
        else{
            System.out.print("Aggregate is not defined!!");
        }
    }
    void display(){
        System.out.println("\nTotal Marks are : "+total);
        System.out.println("Your aggregate is : "+aggregate);
    }
}
class StudentMarks{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int W, X, Y, Z;
        System.out.print("Enter the marks in Python: ");
        W=s.nextInt();
        System.out.print("Enter the marks in C-Programming: ");
        X=s.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        Y=s.nextInt();
        System.out.print("Enter the marks in Physics: ");
        Z=s.nextInt();
        if(W<0||W>100||X<0||X>100||Y<0||Y>100||Z<0||Z>100){
            do{
            System.out.print("Enter a valid mark(i.e between 0 and 100)!!\n");
            System.out.print("Re-Enter Again Marks Properly.\n");
            System.out.print("Enter the marks in Python: ");
            W=s.nextInt();
            System.out.print("Enter the marks in C-Programming: ");
            X=s.nextInt();
            System.out.print("Enter the marks in Mathematics: ");
            Y=s.nextInt();
            System.out.print("Enter the marks in Physics: ");
            Z=s.nextInt();
            }while(W<0||W>100||X<0||X>100||Y<0||Y>100||Z<0||Z>100);
        }
        Grade obj=new Grade();
        obj.getmarks(W, X, Y, Z);
        obj.caltotal();
        obj.calaggregate();
        obj.calgrade();
        obj.display();
    }
}
