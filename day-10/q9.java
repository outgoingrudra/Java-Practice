//dynamic method dispatch 

class A{
    void display(){
        System.out.println("FRom A ~~~~");
    }
}

class B extends A{

     void display(){
        System.out.println("FRom B ~~~~");
    }
   
}
class q9{
    public static void main(String[] args) {
        A  x = new B();
        x.display();
    }
}