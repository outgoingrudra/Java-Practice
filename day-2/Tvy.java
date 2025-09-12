class TV{
    void switchOn(){
        System.out.println("TV SWITCHED ON !!!");
    }
    void changeChannel(){
        System.out.println("Channel Changed of TV !!!");

    }
}
class SmartTv extends  TV{
    void browse(){
        System.out.println("Browsing Youtube !!");
    }


}

class Tvy{
    public static void main(String[] args) {
        TV t1 = new SmartTv();
        t1.switchOn();
        t1.changeChannel();
        

        SmartTv t2 = new SmartTv();
        t2.changeChannel();
        t2.browse();
    }
}