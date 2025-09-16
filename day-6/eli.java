
import java.util.Scanner;

class eli{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age =s.nextInt();

        if (age >=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}