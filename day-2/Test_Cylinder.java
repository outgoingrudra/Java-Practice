class circle{
    int radius ;

    public circle() {
        radius = 0;
    }

    public circle(int radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    
     
}
class Cylinder extends  circle{
    int height ;

    public Cylinder() {
        height=0;
    }

    public Cylinder(int height, int radius) {
        super(radius);
        this.height = height;
    }
    public double  volume(){
        return area()*height;
    }
    

}

class Test_Cylinder{
    public static void main(String[] args) {
        Cylinder c = new Cylinder(23,11);
        System.out.println("Area :"+c.area());
        System.out.println("Volume :"+c.volume());
        
    }
}