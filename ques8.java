import java.util.Scanner;
public class ques8 {
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,5,2,7,5,2};
        int count = 0;
        for (int i=0; i < arr.length;i++){
            if(arr[i]==2){
                count++;
            }
        }
        System.out.println("Number of times 2 appears in the array: " + count);

    }
    
}
