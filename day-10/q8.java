class A{
    final void display(){
        System.out.println("FRom A ~~~~");
    }
}

class B extends A{
    // void display(){
    //     //showing error 
    // }
}
class q8{
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}