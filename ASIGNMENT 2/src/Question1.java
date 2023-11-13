//Write a java program that reads a Fahrenheit degree in a
// double value from the console, then
//converts it to Celsius

import java.util.Scanner;
public class Question1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("this program is for changing temperature\n\t \"from Fahrenheit to celsius\"");
        // (Fahrenheit-32) *(5/9)
        System.out.println("Enter a degree in Fahrenheit:");
        double fahrenheit = input.nextInt();
        double celsius =  (fahrenheit-32) *(5.0/9.0);
        System.out.println(fahrenheit+" fahrenheit is "+celsius+"celsius");



    }
}
