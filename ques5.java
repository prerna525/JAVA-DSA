import java.util.Scanner;
public class ques5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,24,8,86,4,5,3,7,9,1};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even elements: " + even);
        System.out.println("Odd elements: " + odd);
    }
    
}
