import java.util.Scanner;
   public class MoveZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]={0,5,0,3,8,0,2};
                int nonzero = 0;
                for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=0){
                    arr[nonzero]=arr[i];
                    nonzero++;
                }}
                for (int i = nonzero; i < arr.length; i++) {
                    arr[i]=0;
                }
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                
    }
    
}
