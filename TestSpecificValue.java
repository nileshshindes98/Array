package array;

import java.util.Scanner;
//Write a Java program to test if an array contains a specific value.
public class TestSpecificValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element i.e. size : ");

        int n = scanner.nextInt();
        int [] a= new int[n];

        System.out.println("Element in array : ");
        for(int i=0;i< a.length;i++)
        {
            a[i]= scanner.nextInt();
        }
            System.out.println();
        System.out.println("Enter the number whcich you find in array : ");
        int b = scanner.nextInt();
        for(int i=0;i< a.length;i++)
            {
                if(a[i]==b)
                {
                    System.out.println("yes its in a array");
                    break;
                }

            }
        System.out.println("Number is not present in array : "+b);
    }
}


