package array;

public class DuplicateString
{
    public static void main(String[] args) {
        String [] a = {"a","b","c","a","c","d"};
        System.out.print("duplicate string : ");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j =i+1;j< a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[j]+" ");
                }
            }
        }
    }
}
