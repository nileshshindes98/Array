package array;

import java.util.Scanner;

public class AddTwoMatrices
{
    public static void main(String[] args)
    {
     int r,c;
     Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of row : ");
        r= scanner.nextInt();

        System.out.println("Enter the number of col : ");
        c = scanner.nextInt();

        int array1 [][]= new int [r][c];
        int array2 [][]=new int [r][c];
        int sum [][] = new int [r][c];

        System.out.println("Input element of 1st matrix ");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                array1[i][j]= scanner.nextInt();

        System.out.println("Input element of 2nd matrix ");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                array2[i][j]= scanner.nextInt();

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                sum[i][j]=array1[i][j]+array2[i][j];
        System.out.println("Sum of the matrices : ");

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                System.out.println(sum[i][j]+"\t");

        System.out.println();   //print empty line

    }
}
