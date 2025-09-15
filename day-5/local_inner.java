class A {
    void display(){
        class Inner{
            void work(){
                System.out.println("Working !!!!!!!!");
            }
        }
        Inner i = new Inner();
        i.work();
    }
}
class local_inner{
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}