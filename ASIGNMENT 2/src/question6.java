//When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The
//distance it travels is given by d = (1/2) gt2
//Here d is in feet, t is the time in seconds, and g is 32.174.
//Write a program that asks the user for the number of seconds and then prints out the distance
//travelled
import java.util.Scanner;
public class question6 {
    public static void main(String args[]){
        System.out.println("the brick is dropped from a tower:");
        System.out.println("write the time required for brick to reach the earth surface in second:");
        Scanner input = new Scanner(System.in);
        double t = input.nextDouble();
        double g = 32.174;
        double d = (1.0/2.0)*g*t*t;
        System.out.println("Distance travelled: "+d);

    }
}
