class A extends Thread{
   public  void run(){
           System.out.println("Thread");
    }
}
class thr{
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}