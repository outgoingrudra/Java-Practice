interface A{
    void work();
}
interface B extends A{
    void play();
}
class inf2 implements B {
    public void play(){
        System.out.println("Play");
    }

    public void work(){
        System.out.println("Work");
}
public static void main(String[] args) {
    A   i1 = new inf2();
    B i2 = new inf2();
    inf2 i3 = new inf2();
    i1.work();
    i2.play();
    i2.work();
    
}

}