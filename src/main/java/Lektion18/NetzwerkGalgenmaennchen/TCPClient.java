package Lektion18.NetzwerkGalgenmaennchen;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        final int PORT = 5000;
        final String HOST = "localhost";
        try (Socket connectionToServer = new Socket(HOST, PORT);
             InputStream is = System.in;
             BufferedReader br = new BufferedReader(new InputStreamReader(is));
             PrintWriter pw = new PrintWriter(new OutputStreamWriter(connectionToServer.getOutputStream()))) {
            String line;

            while (true) {
                while ((line = br.readLine()) != null) {
                    pw.println(line);
                    pw.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
