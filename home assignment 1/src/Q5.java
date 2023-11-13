//Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
  //      W will move to A, A to K, K to G and finally G to W. Exchange using with and without
    //    using extra variable
public class Q5{
    public static void main(String[] args){
        int w = 1 ;
        int g = 2 ;
        int k = 3 ;
        int a = 4 ;
        System.out.println("values of variable before exchanging :");
        System.out.println("w="+w);
        System.out.println("g="+g);
        System.out.println("k="+k);
        System.out.println("a="+a);
        // code using new variable:
        /**int z = a ;
        a = w ;
        w = g ;
        g = k ;
        k = z ;*/
        //code without using new variable.



        System.out.println("values of variable after exchanging :");
        System.out.println("w="+w);
        System.out.println("g="+g);
        System.out.println("k="+k);
        System.out.println("a="+a);


        //code without using third variable:
        w = w + a ;
        a = w - a ;
        k = w - a ;




       

    }
}
