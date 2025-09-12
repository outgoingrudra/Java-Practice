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

class dyn_meth_dis{
    public static void main(String[] args) {
       A b = new B();
       b.display();
    }
}