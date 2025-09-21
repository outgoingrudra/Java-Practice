interface  playable{
    void play();
}

class piano implements playable{
    public void play(){
        System.out.println("Piano");
    }
}

class guitar implements playable{
    public void play(){
        System.out.println("Guitar");
    }
}
class q6{
    public static void main(String[] args) {
        playable p1 = new piano();
        playable p2 = new guitar();

        p1.play();
        p2.play();
    }
}