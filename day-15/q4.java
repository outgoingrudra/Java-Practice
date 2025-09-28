
@FunctionalInterface
interface  A {
    int  display(int x , int y );

}
class q4{
    public static void main(String[] args) {
        A a= (x,y)-> {
            int ans = x*y;
            return ans ;
        };

     System.out.println("ans : "+   a.display(12,34));
    }
}