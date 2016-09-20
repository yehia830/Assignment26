package tiy.webapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class WebChatClient {
    Socket clientSocket;
    PrintWriter out;
    BufferedReader in;



    public String sendMessage(String message) {
        String serverResponse = null;
        try {
            createClientSocket();

            out.println(message);
            serverResponse = in.readLine();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return serverResponse;

 //      return null;
    }





    public void createClientSocket() throws IOException {
        clientSocket = new Socket("localhost", 8005);

        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }
}



