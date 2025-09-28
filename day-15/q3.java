
@FunctionalInterface
interface  A {
    int  display(int x , int y );

}
class q3{
    public static void main(String[] args) {
        A a= (x,y)-> x*y;

     System.out.println("ans : "+   a.display(12,34));
    }
}