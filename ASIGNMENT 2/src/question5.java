//Write a java program that reads the radius of a hemisphere and computes the surface area
//and volume using the following formulas:
//Surface Area of Hemisphere = 3 π r2
//. Volume of a hemisphere = (2/3)πr3
//Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the
//hemisphere. Hint: Use Math.PI.
import java.util.Scanner;

public class question5 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius  of the hemisphere:");
        double r = input.nextDouble();

        double sa =  3.0*Math.PI* Math.pow(r,2) ;
        double vh =  (2.0/3)*Math.PI *Math.pow(r,3);
        System.out.println("surface area of Hemisphere :"+sa);
        System.out.println("volume  of Hemisphere :"+vh);

    }
}
