public class Fibonacci_series {
    public static void main(String[] args) {
        int a =0;
        int b =1;
        int c,i;

        int count=10;
        for( i=2;i<=count;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
