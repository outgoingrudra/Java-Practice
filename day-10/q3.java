abstract  class shape{
    abstract  void area();
    abstract  void dimension();
}
class circle extends shape{
    int r;

    public circle(int r) {
        this.r = r;
    }
    @Override
    void area(){
            System.out.println("Area :"+(Math.PI*r*r));
    }
    @Override
    void dimension(){
        System.out.println("radius : "+r);
    }
    
}


class square extends shape{
    int a;

    public square(int r) {
        this.a = r;
    }
    @Override
    void area(){
            System.out.println("Area :"+(a*a));
    }
    @Override
    void dimension(){
        System.out.println("side : "+a);
    }
    
}

class q3{
    public static void main(String[] args) {
        circle c = new circle(1);
        shape s = new square(5);
        c.area();
        c.dimension();
        s.dimension();
    }
}