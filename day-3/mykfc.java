abstract  class kfc {
     abstract  void display();
     abstract  void bill();

}

class myshop extends kfc {
    @Override
    void display(){
        System.out.println("Welcome to KFC STORE !!! ");
    }
    @Override
    void bill(){
        System.out.println("Bill : 199$/-");
    }
}
class mykfc{
    public static void main(String[] args) {
        kfc s = new myshop();
        s.display();
        s.bill();
    }
}