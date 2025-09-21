

class Account {
    String name ;
    int id;
    double bal;
    static int num=123132323;

    public Account(String name, double bal) {
        this.name = name;
        this.id =num++;
        this.bal = bal;
    }
    void deposit(double d){
        bal+=d;
        System.out.println("Desposited"+d);
    }
    void withdrawl(double d){
        bal-=d;
        System.out.println("Withdrawl"+d);
    }
    void checkBalance(){
        System.out.println("Available Balanace :"+bal);
    }
    void user(){
        System.out.println("Name :"+name);
        System.out.println("Account ID :"+id);
          checkBalance();
    }
    
}
class q2{
    public static void main(String[] args) {
        
        Account s1 = new Account("user1", 1000);
        s1.user();
        s1.deposit(100);
        s1.withdrawl(50);
        s1.user();
    }
}