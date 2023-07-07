package array;

public class SumValues {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 4, 2, 9, 7};
        //printed given array
        System.out.print("Printed array : ");
        for (int i :arr) {
            System.out.print(" "+i);
        }
 int temp =0;
         for(int i : arr){
             temp += i;
            }
        System.out.println();
        System.out.println("sum of array : "+temp);
        }
    }

