abstract  class A{
    void dis(){
        System.out.println("Hy abstraty");
    }
    abstract  void work();
}
class B extends  A{
    void work(){
        System.out.println("Working");
    }
}
class abs2{
    public static void main(String[] args) {
        B b = new B();
        b.dis();
        b.work();

        A a = new B();
        a.dis();
        a.work();
    }
}