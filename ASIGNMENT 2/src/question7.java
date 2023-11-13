// Write a java program that displays the following table. Cast floating-point numbers into
//integers.
//a b pow(a, b)
//1 2 1
//2 3 8
//3 4 81
//4 5 1024
//5 6 15625
import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.Scanner;
public class question7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int  a,b;
        double c ;

        /**a = 1;
        b = 2 ;
        c = Math.pow(a,b);
        System.out.println("a b  pow(a,b)");
        System.out.println(a+" "+b+" "+c);
        a+=1;
        b+=1;
        c = Math.pow(a,b);
        System.out.println(a+" "+b+" "+c);
        a+=1;
        b+=1;
        c = Math.pow(a,b);
        System.out.println(a+" "+b+" "+c);
        a+=1;
        b+=1;
        c = Math.pow(a,b);
        System.out.println(a+" "+b+" "+c);
        a+=1;
        b+=1;
        c = Math.pow(a,b);
        System.out.println(a+" "+b+" "+c);
        a+=1;
        b+=1;
        c = Math.pow(a,b);
        System.out.println(a+" "+b+" "+c);
         */
        a=1;
        b= 2;
        System.out.println("a b pow(a,b)");
        for (a=1;a<100;a++){

            c = Math.pow(a,b);
            System.out.println(a+" "+b+" "+c);
            b+=1;








    }
}
}

