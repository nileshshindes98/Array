package array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args)
    {
        int [] a = {5,6,7,8,9,7,2,8};
        System.out.println("original Array : "+Arrays.toString(a));
        int removeIndex = 5;
        for (int i=removeIndex;i< a.length-1;i++){
            a[i]=a[i+1];
        }
        System.out.println("After removing the element: "+ Arrays.toString(a));
    }
}
