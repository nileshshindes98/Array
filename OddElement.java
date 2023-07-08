package Array;

public class OddElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Elements of array:");
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
        System.out.println("\nElements at odd positions:");
        for (int i = 0; i < a.length; i += 2) {
            System.out.println("Element at odd position: " + a[i]);
        }
    }
}
