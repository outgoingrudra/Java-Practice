class Coffee{
    private float qty=0;
    static  private  Coffee my = null;
    private Coffee(){
        qty = 1;
    }
    static  Coffee getInstance(){
        if(my==null){
            my = new Coffee();
          
        }
          return my;
        
    }
}

class q3{
    public static void main(String[] args) {
        Coffee c1 = Coffee.getInstance();
        Coffee c2 = Coffee.getInstance();
        Coffee c3 = Coffee.getInstance();

        if(c1.equals(c3)){
            System.out.println("Singleton Class");
        }
    }
}