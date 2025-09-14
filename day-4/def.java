interface A {
    void meth1();
    default void meth2(){
        System.out.println("Default ");
    }
}

class def implements A{
    public void meth1(){
        System.out.println("Meth - 1");
    }
    public static void main(String[] args) {
        A d = new def() ;
        d.meth1();
        d.meth2();
    }
}