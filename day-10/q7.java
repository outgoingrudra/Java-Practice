class A{
    private int a = 10;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
}
class q7{
    public static void main(String[] args) {
        A a = new A()   ;
        System.out.println(a.getA());
        a.setA(200);
        System.out.println(a.getA());
    }
}