interface  Member{
    void callback();
}

class Customer implements  Member{
    String name ;

    public Customer(String name) {
        this.name = name;
    }
    

    public void callback(){
        System.out.println("Okay !!!!! I will come ~ "+ name);
    }
}

