enum dept{
    CS("John","Block A"), IT("Smith","Block B");
    String head ;
    String loc;
    private  dept(String head,String loc){
        this.head = head;
        this.loc = loc;
    }

    public String headName(){
        return  head;
    }
    public String Location(){
        return  loc;
    }
}

class q4{
    public static void main(String[] args) {
        dept d = dept.IT;
        System.out.println("Head : "+d.headName());
        System.out.println("location : "+d.Location());
    }
}