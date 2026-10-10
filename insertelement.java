import java.util.Scanner;
public class insertelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        int position = 2;
        int value = 25;
    for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
        System.out.println("Array after inserting " + value + " at position " + position + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }}
