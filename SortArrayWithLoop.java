package array;

public class SortArrayWithLoop {
    public static void main(String[] args) {
        int []arr = {5,8,4,3,7,5,4,88};
        int temp = 0;
        for(int i = 0;i< arr.length;i++)
        System.out.print(" "+arr[i]);

        for(int i = 0;i< arr.length;i++){
            for(int j = i+1; j< arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            break; // i wanted to just compare if statement perform and break
        }
        System.out.println();
        System.out.println("Sorted array : ");
        for(int i = 0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
