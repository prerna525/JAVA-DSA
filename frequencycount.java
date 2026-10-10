import java.util.Scanner;
public class frequencycount {
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int arr[] = {10, 20, 30, 10, 50, 10, 20, 30};
            int count = 0;
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == 10)
                {
                    count++;
                }
            }
            System.out.println("The frequency of 10 in the array is: " + count);
    
        }}
