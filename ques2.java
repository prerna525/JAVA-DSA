import java.util.Scanner;
public class ques2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        int sum=0;
        {
            for(int i=0;i<arr.length;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println("Sum of array elements: " + sum);
        }

    }
    
}
