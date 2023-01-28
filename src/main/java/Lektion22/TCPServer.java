package Lektion22;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        final int PORT = 5000;
        try (ServerSocket serverSocket = new ServerSocket(PORT);
             Socket connection = serverSocket.accept();
             InputStream is = connection.getInputStream();
             InputStream serverMessage = System.in;
             BufferedReader readServerMessage = new BufferedReader(new InputStreamReader(serverMessage));
             BufferedReader br = new BufferedReader(new InputStreamReader(is)))
        {
            while (true) {
                String nextLine = br.readLine();
                System.out.println("MESSAGE FROM CLIENT: " + nextLine);
                String messageToClient = System.console().readLine();
                System.out.println("CONSOLE: " + messageToClient);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
