class A {
    static  int x ;

    static {
        x=10;
        System.out.println("Hey from Static block");
    }
}
class stbl{
    public static void main(String[] args) {
        System.out.println(A.x);
        System.out.println("Main Class");
        A a = new A();
        
    }
}