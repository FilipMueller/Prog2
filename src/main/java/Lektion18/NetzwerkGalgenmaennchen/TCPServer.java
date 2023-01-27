package Lektion18.NetzwerkGalgenmaennchen;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        final int PORT = 5000;
        try (ServerSocket serverSocket = new ServerSocket(PORT);
             Socket connection = serverSocket.accept();
             InputStream is = connection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is)))
        {
            while (true) {
                String nextLine = br.readLine();
                System.out.println("SERVER: " + nextLine);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static char[] createWord() {
        String[] words = {"PROGRAMMIEREN", "HOSCHSCHULE", "JAVA", "SERVER", "INTELLIJ"};
        int randFactor = (int) (Math.random() * 5);
        return words[randFactor].toCharArray();
    }
}
