package array;

public class AvgValue {
    public static void main(String[] args) {
        int [] a = {5,6,8,9,7,4,3};
        System.out.print("Given number of array : ");
        for (int c : a){
            System.out.print(" "+c);
        }
        int sum =0;
        for(int i : a){
            sum += i;
        }
        int b =sum/2;
        System.out.println();
        System.out.println(" Avf value of number : "+b);
    }

}
