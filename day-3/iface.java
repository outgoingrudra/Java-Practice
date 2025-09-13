interface  A {
    void dis();

}
class iface implements  A{
    public void dis(){
        System.out.println("Interface");
    }
    public static void main(String[] args) {
        A a = new iface();
        a.dis();
    }
}
