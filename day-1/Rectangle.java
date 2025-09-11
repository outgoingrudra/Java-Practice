
import java.util.Scanner;

class Rectangle{
    public static void main(String[] args) {
        double l,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter l and b :");
        l=s.nextInt();
        b=s.nextInt();
        System.out.println("Area "+(l*b));
        System.out.println("perimeter "+(l+l+b+b));
    }
}