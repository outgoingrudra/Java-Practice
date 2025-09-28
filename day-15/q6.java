
@FunctionalInterface
interface  A {
    int  display(int x , int y );

}
class q6{
     static int c = 10;
    public static void main(String[] args) {
        A a= (x,y)-> {
            int ans = x*y;
            return ans*c++ ;
        };

     System.out.println("ans : "+   a.display(12,34));
    }
}