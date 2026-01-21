import java.util.Scanner;
public class Second Largest
{
    public static void main(String args[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        size= sc.nextInt();
        int []arr=new int[size];

        for (int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();

        }
        for (int i=0;i< arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1-i;j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i=0;i<size;i++)
        {

            //System.out.print(arr[i]);

        }
        System.out.println(arr[arr.length-2]);

    }
}
