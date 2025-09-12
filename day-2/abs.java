abstract  class A{
    abstract void   dis();
}

class B extends A{
    void dis(){
        System.out.println("Hey");
    }
}
class abs {
    public static void main(String[] args) {
        B b = new B();
        b.dis();
    }
}