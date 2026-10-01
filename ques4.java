import java.util.Scanner;
public class ques4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,24,8,87,93};
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array: " + min);
    }
    
}
