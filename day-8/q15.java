

import java.util.Scanner;

// freq

public class q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        
        
        for(int x : arr){
            int count =0;
            for(int y : arr){
                if(x==y){
                    count++;
                }
            }
            System.out.println(x+" -> "+count);
          
        }
    }
}