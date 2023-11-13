import java.sql.SQLOutput;

public class quiz {
    public static void main(String args[]){
        int a = 5,b =10 ,c =15 ;
        System.out.print("\"a\n\t b \"+\"5\t\n\\c");
        System.out.println(a+'A'+b/c+"A"+c/b);
        a=a+b+c;
        b=a-b+c;
        c=a-b-c ;
        a=a-b-c;

        System.out.print(a+b+c);
    }
}
