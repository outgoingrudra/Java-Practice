class my{
    final int min = 1;
    final int gen ;
    final int max;

    public my() {
        this.gen = 0;
       
    }
    {
        max=3;
    }
   final  void display(){
                 System.out.println(min+" "+gen+" "+max);
    }
    

}
class my2 extends  my {
//     void display(){

//     }
// } show error 
}

class q2{
    public static void main(String[] args) {
        my m = new my();
       m.display();

        
    }
}