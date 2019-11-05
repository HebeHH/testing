package ClassPlanner;

import java.io.IOException;

public class Testable {

    public static void main(String [] args) throws IOException {
        System.out.println("start");
        Networking listen = new Networking();
        System.out.println("hello");
        listen.sendString("GET / HTTP/1.1");
        System.out.println("world");
        listen.listener();
        System.out.println("done");
    }
}

