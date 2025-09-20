class Test extends Thread{
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
class q13{
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        int i=1;
         while (true) { 
            System.out.println("Main-"+(i++));
        }

    }
}