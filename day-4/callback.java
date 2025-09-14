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
class Store{
    Member m[] = new Member[100];
    int c=0;
    void register(Member m ){
        this.m[c++]= m ;

    }
    void Invite(){
        for(int i =0;i<c;i++){
            m[i].callback();
        }
    }

}
class callback{
    public static void main(String[] args) {
        Customer c1 = new Customer("Rudra");
        Customer c2 = new Customer("Alok");
        Customer c3 = new Customer("Vinay");
        Store s  = new Store();
        s.register(c3);
        s.register(c2);
        s.register(c1);

        s.Invite();
    }
}

