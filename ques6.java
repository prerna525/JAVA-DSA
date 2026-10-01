import java.util.Scanner;
public class ques6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,-6,8,10};
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>0)
            {
                positive++;
            }
            else if (arr[i]<0)
            {
            negative++;
        }
        else
        {
            zero++;
        }}}}