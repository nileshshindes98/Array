package array;

import java.util.Arrays;

// Write a Java program to copy an array by iterating the array.

public class CopyArray
{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,8};
        int [] n = new int[7];
        System.out.println("original array : "+ Arrays.toString(a));
        for(int i=0;i< a.length;i++)
        {
                n[i] = a[i];
        }
        System.out.println("New Array: "+Arrays.toString(n));
    }
}
