
class Outer{
    int x =10;
    class Inner{
        int y = 20;
        void display(){
            System.out.println(x+" "+y);
        }
    }
    void outer_dis(){
        Inner i = new Inner();
        i.display();
    }
}



class nestedInner{
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outer_dis();
    }

}