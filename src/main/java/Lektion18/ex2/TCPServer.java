package Lektion18.ex2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000);
             Socket connection = serverSocket.accept();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connection.getOutputStream())))
        {
            while (true) {
                String inputFromClient = bufferedReader.readLine();
                System.out.println("Message from Client: " + inputFromClient);
                printWriter.println("OK");
                printWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
