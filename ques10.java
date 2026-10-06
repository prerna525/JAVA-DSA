import java.util.Scanner;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={4,4,2,4,6,8,9};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate element is: "+arr[j]);
                }
            }
        }
    }
}
