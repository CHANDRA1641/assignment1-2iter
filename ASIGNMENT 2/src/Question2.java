import java.util.Scanner;

//The distance between two cities (in km.) is input through the keyboard. Write a java program
//to convert and print this distance in meters, feet, inches and centimetres.
public class Question2 {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("write the distance in km :");
        int km = Sc.nextInt();
        int meter = 1000 * km ;
        double feet = 3280.8399 * km ;
        double inches = 39370.0787* km ;
        int cm = 100000 * km ;
        System.out.println(km + " km is" + meter+"meters");
        System.out.println(km + " km is" + feet+"feet");
        System.out.println(km + " km is" + inches+"inches");
        System.out.println(km + " km is" + cm+"centimeter");


    }
}
