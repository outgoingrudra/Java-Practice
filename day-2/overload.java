class A{
    int h ;
    int g;

    public A() {
        h=0;

    }

    public A(int h) {
        this.h = h;
        g=0;
    }

    public A(int h, int g) {
        this.h = h;
        this.g = g;
    }
    public void display(){
        System.out.println(h+" "+g);
    }
    
    

}
class overload{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(23);
        A a3 = new A(11,23);
        a1.display();
        a2.display();
        a3.display();

    }
}