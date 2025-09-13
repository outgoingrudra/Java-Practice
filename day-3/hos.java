abstract  class hospital {
    void display(){
        System.out.println("Hospital of Rudra");

    }
    abstract  void work();

}
class MyHospital extends hospital{
    void work(){
        System.out.println("work");
    }
}
class hos{
    public static void main(String[] args) {
        hospital h = new MyHospital();
        h.display();
        h.work();
    }
}