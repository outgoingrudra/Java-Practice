
@FunctionalInterface
interface  A {
    void display();

}
class q1{
    public static void main(String[] args) {
        A a= ()-> {System.out.println("lambda Exp...");};

        a.display();
    }
}