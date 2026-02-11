import java.util.*;
public class ArrayDuplicate
{
    public static void main(String args [])
    {
        int [] arr={5,6,4,8,5,7,8,2};
        int [] arr1=new int[arr.length];
        int k = 0;

        for (int i=0;i<arr.length;i++)
        {
            boolean isDuplicate = false;

            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate)
            {
                arr1[k++] = arr[i];
            }
        }

        for (int i=0;i< k-1;i++)
        {
            for(int j=0;j< k-1-i;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        for (int i=0;i<k;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
