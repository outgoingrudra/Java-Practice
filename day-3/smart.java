class Phone {
    void call() {
        System.out.println("Calling !!");
    }

    void sms() {
        System.out.println("SMS !!!");
    }
}

interface camera {
    void click();
    void capture();
}

interface music {
    void start();
    void pause();
}

class smart extends Phone implements camera, music {
    // implementing camera
    public void click() {
        System.out.println("Clicking photo !!");
    }

    public void capture() {
        System.out.println("Capturing video !!");
    }

    // implementing music
    public void start() {
        System.out.println("Music started !!");
    }

    public void pause() {
        System.out.println("Music paused !!");
    }

    // main inside smart
    public static void main(String[] args) {
        smart s = new smart();

        // Phone features
        s.call();
        s.sms();

        // Camera features
        s.click();
        s.capture();

        // Music features
        s.start();
        s.pause();
    }
}
