import java.util.Scanner;
public class descending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]={4,1,7,3,9};
    for( int round = 0; round < arr.length-1; round++)
    {
        for (int i = 0; i < arr.length-1-round; i++)
        {
            if(arr[i] < arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }     
    
}
}
