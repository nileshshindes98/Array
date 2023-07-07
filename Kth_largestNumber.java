package array;

public class Kth_largestNumber {
    public static void main(String[] args) {
        int[] a = {4, 5, 8, 3, 4, 3, 8, 4};
        int k = 2;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(k + " largest number is " + a[i]);
                break;
            }
        }
        System.out.println("-------------------------");
        System.out.println("Element of array : ");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

