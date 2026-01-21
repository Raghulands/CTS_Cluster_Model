import java.util.Scanner;

public class Vowels Count
{
    public static void main(String args[])
    {
        int count=0;
        String vowel="AIEOUaeiou";
        String entry="";
        Scanner sc=new Scanner(System.in);
        entry= sc.nextLine();
        for (int i=0;i<entry.length();i++)
        {
            if(vowel.indexOf(entry.charAt(i)) != -1)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
