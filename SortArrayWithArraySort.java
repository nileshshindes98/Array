package array;

import java.util.Arrays;

public class SortArrayWithArraySort {
    public static void main(String[] args) {
        int []arr ={15,56,8,96,45,35};
        String [] str = { "Java", "Python", "PHP", "C#", "C Programming", "C++"};
        System.out.println("Original numeric array : "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted numeric array : "+ Arrays.toString(arr));

        System.out.println(); //print Empty line

        System.out.println("original String Array : " +Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("sorted String array : "+Arrays.toString(str));
    }
}
