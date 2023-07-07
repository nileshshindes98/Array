package array;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int n = scanner.nextInt();
        int [] a =new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("max value is : "+max);
    }
}
