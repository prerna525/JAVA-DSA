import java.util.Scanner;
public class fjg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]={-1,-2,-3,0,1,2,4,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                System.out.println("Positive");
            } else if (arr[i]<0){
                System.out.println("Negative");
            } else{
                System.out.println("Zero");
                }
        }
    }
    
}
