/*
Bring out the situation in which member names of a subclass hide members by the same name in the super class. 
How it can be resolved? Write Suitable code in Java and 
Implement above scenario with the Parametrized Constructor 
(accept int type parameter) of the Super Class can be called from Sub Class Using super () and display the input values provided.

Input :
	Assign or input values for super class and sub class members.
Pseudo :
               Define super class and sub class with one member (has same name)
	Define method in super class and sub class with same method signature
	Declare the object in main method
	Invoke methods using object to display the values

Output :
Sample Input : 100, 200
Sample Output : 100, 200
Test Cases
1.	10, 20
2.	-20, -30
3.	0, 0
4.	EIGHT FIVE
5.	10.57, 12.58
 */

import java.util.*;
class Superclass{
    protected int number1;
    Superclass(int number1){
        this.number1=number1;
    }
    void display(){
        System.out.println("The Numbers are:\n"+number1);
    }
}
class Subclass extends Superclass{
    private int number1, number2;
    Subclass(int number1, int number2){
        super(number1);
        this.number2=number2;
    }
    void display(){
        super.display();
        System.out.println(number2);
    }
}
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Numbers:\n");
        /*int number1=s.nextInt();
        int number2=s.nextInt();
        if((!(isDigit(number1)))||(!(isDigit(number2)))){
            System.out.print("Enter a Numerical Input!!");
        }*/
        int number1, number2;
        try {
            number1 = s.nextInt();
            number2 = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a Numerical Input!!");
            return;
        }
        Subclass obj=new Subclass(number1, number2);
        obj.display();
    }
}
