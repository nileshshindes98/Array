package array;
import java.util.Arrays;
public class CommonString {
    public static void main(String[] args) {

        String[] array1 = {"Nilesh", "Yogesh", "Rajat"};
        String[] array2 = {"Rajat", "Yogesh", "Akshar"};

        int commonCount = 0;

        for (String element1 : array1)
        {
            for (String element2 : array2)
            {
                if (element1.equals(element2))
                {
                    commonCount++;
                    break;
                }
            }
        }

        String[] commonElements = new String[commonCount];
        int index = 0;

        for (String element1 : array1) {
            for (String element2 : array2) {
                if (element1.equals(element2)) {
                    commonElements[index] = element1;
                    index++;
                    break;
                }
            }
        }

        System.out.println("Common Element : ");
        for (String commonElement : commonElements) {
            System.out.println(commonElement);
        }
    }
}

