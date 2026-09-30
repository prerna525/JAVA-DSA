import java.util.Scanner;
public class array3 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number= new int[size];
        //input
        for(int i=0;i<size;i++)
        {
            number[i]=sc.nextInt();
        }
        //output
        for(int i=0;i<number.length;i++){
            int x =sc.nextInt();
            if(number[i] == x)
        
           System.out.println("x found at index: " + i);
        }}
    }

