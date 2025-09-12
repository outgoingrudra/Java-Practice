class A{
    void display(){
        System.out.println("A");
    }
}
class B extends  A{
    @Override
    void display(){
        System.err.println("B");
    }
}

class overriding{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.display();
        b.display();
    }
}