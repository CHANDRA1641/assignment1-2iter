public class swap {
    public static void main(String[] args){
        /**
         * swap of three numbers int a = 10;
        int b = 20 ;
        int c =30 ;
        System.out.println("a="+a+", b= "+b+ "c="+c);
        a=a+b+c;
        b =a - (b+c);
        c = a -(b+c);
        a = a -(b+c);
        System.out.println("a="+a+", b= "+b+ "c="+c);*/
        //swap of four numbers .
        int w= 10, a=20 , k=30 ,g = 40 ;
        w=w+a+k+g;
        a=w-(a+k+g);
        k=w-(k+g+a);
        g=w-(a+k+g);
        w=w-(a+k+g);
        System.out.println(""+w + a+ k+   g);



    }
}
