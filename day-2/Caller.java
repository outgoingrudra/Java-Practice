class Parent{

    public Parent() {
        System.out.println("Parent");
    }
    
}
class child extends Parent{

    public child() {
        System.out.println("Child");
    }
    
}
class Caller{
    public static void main(String[] args) {
        child c1 = new child();
        
    }
}