import java.util.Scanner;
public class removeduplicates {
    public static void main(String[] args) {

        int arr[] = {2, 4, 2, 5, 4, 7};

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate == false) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
    
}
