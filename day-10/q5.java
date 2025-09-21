class A{
    static int count=0;

    public A() {
        count++;
    }
    static  void display(){
        System.out.println("Objects created :"+count);
    }
    
}
class q5{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        A a6 = new A();
        A a7 = new A();
        A.display();
    }
}