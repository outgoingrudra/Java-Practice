class A{
    static {
        System.out.println("Hey");
    }

    static {
        System.out.println("Bye");
    }
}

class stbl2 {
    public static void main(String[] args) {
        A a = new A();
    }
}