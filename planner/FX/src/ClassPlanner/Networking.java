package ClassPlanner;

import javax.activation.DataSource;
import java.io.*;
import java.net.Socket;

public class Networking {
    String server ;
    int port;
    Socket socket;
    InputStreamReader inputStreamReader;
    BufferedReader in_reader;
    BufferedWriter out_writer;
    OutputStreamWriter outputStreamWriter;

    public Networking() throws IOException {
        server   = "172.29.182.2";
        port   = 5555;
        System.out.println("hello from NW");
        socket = new Socket(server, port);
        System.out.println("got sock");
        inputStreamReader = new InputStreamReader(socket.getInputStream());
        in_reader = new BufferedReader(inputStreamReader);
        System.out.println("got in");
        outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        out_writer = new BufferedWriter(outputStreamWriter);
        System.out.println("gor out");

    }


    public  void sendString(String str) {
        try {
            out_writer.write(str + "\r\n");
            out_writer.flush();
        }
        catch (java.io.IOException e) {
            System.out.println(e);
        }
    }



    public void listener () throws IOException {
        Thread listen_to_input_thread = new Thread(){
            public void run() {
                try {
                    System.out.println("++++ Start of while loop (reader)");
                    String line = null;
                    while ((line = in_reader.readLine()) != null) {
                        System.out.println(">>> "+line);
                    }
                    System.out.println("++++ End of line from the socket.");
                } catch (java.io.IOException e) {
                    System.out.println("ERROR I/O");
                }
                System.out.println("++++ End of while loop (reader)");
            }
        };
        listen_to_input_thread.start();
        System.out.println("++++ Thread started");
    }

}
