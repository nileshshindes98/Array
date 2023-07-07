package array;

//Write a Java program to find the index of an array element.

import java.util.Scanner;
public class FindIndexofElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();
        int [] a = new int[n];

        System.out.println("Enter the Element of the array : ");
        for(int i=0;i<n;i++){
                a[i]= scanner.nextInt();
        }
        //display the printed element
        System.out.print("Array : ");
        for(int element : a)
        {

            System.out.print(element+" ");
        }

        System.out.println();
        System.out.println("Enter number to find Index of them :");
        int b = scanner.nextInt();
        System.out.println("Index Number of "+b);
        int index = -1;
        for(int i=0;i< a.length;i++)
        {
            if(b==a[i]){
                index=i;
            }
        }
        if (index != -1) {
            System.out.println("The element " + b + " is found at index " + index);
        } else {
            System.out.println("The element " + b + " is not found in the array.");
        }
    }
}
