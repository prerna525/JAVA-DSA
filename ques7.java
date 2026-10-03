import java.util.Scanner;
public class ques7 {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int arr[]={75 ,73,3,7,58,32};
    int max=arr[0];
    int sec = Integer.MIN_VALUE;
    for (int i=0; i < arr.length;i++){
        if(arr[i]>max){
            sec = max;
            max=arr[i];}
            else if (arr[i]>sec && arr[i]!=max){
                sec=arr[i];
            }}
            System.out.println("Second maximum element in array: " + sec);}}
