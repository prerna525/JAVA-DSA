import java.util.Scanner;
public class ques3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,24,8,87,93};
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array: " + max);
    }
    
}
