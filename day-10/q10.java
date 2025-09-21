class A{
    static int x=10;
    class B{
        void  display(){
            System.out.println("Inner Class"+x);
        }
    }
    void display(){
        System.out.println("From A |||||||||||||||||");
        new B().display();
    }
}

class q10{
    public static void main(String[] args) {
        new A().display();
    }
}