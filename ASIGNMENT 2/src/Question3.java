//Enter the basic salary of an employee of an organization through the keyboard. His dearness
//allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
//salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross
//salary

import java.util.Scanner;
public class Question3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the  basic salary of a employ :");
        int salary = input.nextInt();
        double da = (40.0/100)*salary ;
        double hra = (20.0/100)* salary ;
        double groos = salary + da +hra ;
        System.out.println("DA is "+da);
        System.out.println("hra is "+hra);
        System.out.println("groos salary is "+groos);



    }
}
