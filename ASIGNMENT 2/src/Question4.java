//Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
//integer. For example, if an integer is 749, the sum of all its digits is 20.
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number between 0 and 1000:");
        int a = input.nextInt();
        int c = a;

        int b = 0;
        if (a < 1000) {
            for (a = c; a > 0; ) {
                b = b + a % 10;
                a = a / 10;



            }
            System.out.println("The sum of the \n" +
                    "digits is\n"+"\t" +b);


        }
        else{
            System.out.println("no.is greater than 1000");
        }
        return ;
    }
}
