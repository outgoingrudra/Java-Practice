
import java.util.Scanner;

// reverse

public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<(arr.length/2);i++){
            int t=arr[i];
            arr[i]= arr[arr.length -i - 1];
             arr[arr.length -i - 1] = t;

        }

        for(int x : arr){
            System.out.print(" "+x);
        }
    }
}