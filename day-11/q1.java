class mydata{
    void display(String s ){
        for(char x : s.toCharArray()){
            System.out.print(" "+x);
        }
    }
}
class Th1 extends Thread{
    mydata d ;
    public void run(){
        d.display("Hello World !!!!!!!!!!!!");
    }

}

class Th2 extends Thread{
    mydata d ;
    public void run(){
        d.display("Welcome ");
    }
    
}


class q1{
    public static void main(String[] args) {
        
    }
}
