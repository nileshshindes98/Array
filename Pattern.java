package array;

public class Pattern {
    public static void main(String[] args) {
            int [][]a = new int[10][10];
            for(int i = 0; i < 10; i++)
            {
                for(int j = 0; j < 10; j++)
                {
                    System.out.printf("1", a[i][j]); //%2d specifies a two-digit decimal integer format.
                }
                System.out.println();
            }
        }
    }
