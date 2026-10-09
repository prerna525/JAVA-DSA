import java.util.Scanner;
public class leftrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
    
            arr[0]=arr[1];
             arr[1]=arr[2];
             arr[2]=arr[3];
            arr[3]=arr[4];
            arr[4]=temp;
        System.out.println("Array after left rotation:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    
}}
