import java.util.Scanner;
public class Trushold max count
{
    public static void main(String args [])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
//        for (int i = 0; i < arr.length - 1; i++)
//        {
//            for (int j = 0; j < arr.length - 1 - i; j++)
//            {
//                if (arr[j] > arr[j + 1])
//                {
//
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
