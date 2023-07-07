package array;

public class SecondLargestNumber
{
    public static void main(String[] args)
    {
        int [] a ={1,5,6,8,9,5,6,8,4,7};
        int temp;
        for(int i=0;i< a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("SecondLargestNumber :"+a[1]);
    }
}
