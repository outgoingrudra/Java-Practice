


class q11{

    static  int area(int l , int b) throws  Exception{
        if(l<0 || b<0){
            throw  new Exception("Wrong dimension");
        }
        return 1;

    }

     static  void meth(){
        try {
             area(-110, 5);
        } 
        catch (Exception e) {
            System.out.println("errors occured");
        }
     }
    public static void main(String[] args) {
        meth();
        
    }
}