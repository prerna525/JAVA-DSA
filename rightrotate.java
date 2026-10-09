import java.util.Scanner;
public class rightrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        int temp=arr[4];
        arr[4]=arr[3];
        arr[3]=arr[2];  
        arr[2]=arr[1];
        arr[1]=arr[0];
        arr[0]=temp;
        System.out.println("Array after right rotation:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
