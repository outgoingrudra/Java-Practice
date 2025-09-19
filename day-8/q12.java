
import java.util.Scanner;

// reverse

public class q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
       int e=0,o=0;
        for(int x : arr){
           if(x%2==0){
            e++;
           }
           else {
            o++;
           }
        }
        
            System.out.println("Even "+e);
      
        
            System.out.println("Odd "+o);
       

    }
}