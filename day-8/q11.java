
import java.util.Scanner;

// reverse

public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
          System.out.println("Enter Key :");
          int key = sc.nextInt();
          boolean flag = false ;
        for(int x : arr){
           if(key==x){
            flag = true;
           }
        }
        if(flag){
            System.out.println("Element Found ! ");
        }
        else {
            System.out.println("Not Found !");
        }

    }
}