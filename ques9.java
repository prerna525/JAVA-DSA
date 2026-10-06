
import java.util.Scanner;
public class ques9 {
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        int arr[]= {2,5,2,7,5,2};
        for(int i=0;i<arr.length;i++)
    {
        int count=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
        }
        System.out.println(arr[i]+" occurs "+count+" times");
    }  }}