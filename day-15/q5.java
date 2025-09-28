
@FunctionalInterface
interface  A {
    int  display(int x , int y );

}
class q5{
   
    public static void main(String[] args) {
        
     int c = 23234;

        A a= (x,y)-> {
            int ans = x*y;
            return ans*c ;
        };

     System.out.println("ans : "+   a.display(12,34));
    }
}