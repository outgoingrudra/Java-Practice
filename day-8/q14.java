// sort 

import java.util.Arrays;
import java.util.Scanner;

// copy from other

public class q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        
        for(int x : arr){
           System.out.print(" "+x);
        }
    }
}