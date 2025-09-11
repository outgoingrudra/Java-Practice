
import java.util.Scanner;

class circle{
    public static void main(String[] args) {
        int r;
        System.out.println("Enter radius :");
        Scanner s= new Scanner(System.in);
        r = s.nextInt();
        System.out.println("Area :"+(Math.PI*r*r));
        System.out.println("CIrcumference :"+(Math.PI*2*r));
    }
}