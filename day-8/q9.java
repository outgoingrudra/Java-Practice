
import java.util.Scanner;

// sum and average

public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        int sum =0;
        for(int x : arr){
            sum+=x;
           
        }
        System.out.println("Sum :"+sum);
        System.out.println("Avg :"+(sum/5));
    }
}