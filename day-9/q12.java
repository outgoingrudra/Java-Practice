
class NegativeDim extends  Exception{
    @Override
    public  String toString(){
        return "Negative Dimension";

    }
}

class q12{

    static  int area(int l , int b) throws  NegativeDim{
        if(l<0 || b<0){
            throw  new NegativeDim();
        }
        return 1;

    }

     static  void meth(){
        try {
             area(-110, 5);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
     }
    public static void main(String[] args) {
        meth();
        
    }
}