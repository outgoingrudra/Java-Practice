
@FunctionalInterface
interface  A {
    void display(int x , int y );

}
class q2{
    public static void main(String[] args) {
        A a= (x,y)-> {System.out.println("lambda Exp...  "+(x+y));};

        a.display(12,34);
    }
}