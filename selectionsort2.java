import java.util.Scanner;
public class selectionsort2 {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        int arr[] = {64, 12,89,5,0,};
        for(int i=0;i<arr.length-1;i++)
            int minIndex=i;
        {
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j

                }}
                int temp=arr[minIndex];
                 arr[minIndex]=arr[i];
                 arr[i]=temp;
        

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

            

      }
    
}
