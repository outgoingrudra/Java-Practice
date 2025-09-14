abstract class A{
    abstract void display();
}
class Outer{
    public void meth(){
        A a = new A(){
           public void display(){
                System.out.println("Displaying");
            }
        };
        a.display();
    }
}
class annInner{
   public static void main(String[] args) {
        Outer x = new Outer();
        x.meth();
        
    
   }

}