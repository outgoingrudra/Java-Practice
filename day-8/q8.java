
import java.util.Scanner;

// largest and smallest 

class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        int max =arr[0];
        int min=arr[0];
        for(int x : arr){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);
    }
}