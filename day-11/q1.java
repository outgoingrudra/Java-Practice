
// async
class mydata{
    void display(String s ){
        for(char x : s.toCharArray()){
            System.out.print(" "+x);
        }
    }
}
class Th1 extends Thread{
    mydata d ;

    public Th1(mydata d) {
        this.d = d;
    }
    
    public void run(){
        d.display("ABCDEFGHIJKLSJSNDJDWHDKNCLMSIWNDKEMNOPQRSTUVWXYZ");
    }

}

class Th2 extends Thread{
    mydata d ;

    public Th2(mydata d) {
        this.d = d;
    }
    
    public void run(){
        d.display("01234567890275737377373828927383738373374744829282735848");
    }
    
}


class q1{
    public static void main(String[] args) {
        mydata d= new mydata();
        Th1 t1 = new Th1(d);
        Th2 t2= new Th2(d);
          
          t1.start();
          t2.start();
    }
}
