
import java.util.Scanner;

// copy from other

public class q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        int another[] = new int[5];
         int i =0;
        for(int x : arr){
           another[i++]=x;
        }
        for(int x : another){
           System.out.print(" "+x);
        }
    }
}