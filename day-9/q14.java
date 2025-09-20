class Test implements Runnable{
     static void display(){
        int i=1;
        while (true) { 
            System.out.println("Test-"+(i++));
        }
    }
    @Override
     public  void run(){
              display();
    }
}
class q14{
    public static void main(String[] args) {
        Test t = new Test();
        Thread t1 = new Thread(t);
        t1.start();
        int i=1;
         while (true) { 
            System.out.println("Main-"+(i++));
        }

    }
}