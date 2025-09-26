class old {
    void display(){
        System.out.println("Hey");
    }
    @Deprecated
    void show(){
        System.out.println("Depreceated !!!!!!!!!!!!!!!!!!!!");
    }
}

class q7{
     @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        
        old o = new old();
       
        o.show();// show note
    }
}