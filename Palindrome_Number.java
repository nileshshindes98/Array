import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        int n;
        int rev = 0;
        int m;
        System.out.println("ENTER THE NUMBER : ");
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        int z = n;
        for (; n != 0; n /= 10) {
            m = n % 10;
            rev = rev * 10 + m;
        }
        System.out.println("reverse number : "+rev);
if(rev==z){
    System.out.println("Number is  palindrome");
}
else{
    System.out.println("Number is not palindrome");
}
    }

}



