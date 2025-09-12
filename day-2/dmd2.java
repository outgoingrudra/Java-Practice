class A{
    void meth1(){System.out.println("Meth 1 of A");}
    void meth2(){System.out.println("Meth 2 of A");}
}
class B extends  A{
      void meth1(){System.out.println("Meth 1 of B");}
      void meth2(){System.out.println("Meth 2 of B");}
      void meth3(){System.out.println("Meth 3 of B");}
}

class dmd2{
    public static void main(String[] args) {
        A b1 = new B();
        b1.meth1();
        b1.meth2();

        B b2 = new B();
        b2.meth1();
        b2.meth2();
        b2.meth3();
    }
}