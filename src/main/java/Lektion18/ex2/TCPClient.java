package Lektion18.ex2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket connectionToServer = new Socket("localhost", 5000);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionToServer.getInputStream()));
             PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(connectionToServer.getOutputStream()));
             Scanner scanner = new Scanner(System.in))
        {
            while (true) {
                String inputFromClient = scanner.nextLine();
                printWriter.println(inputFromClient);
                printWriter.flush();
                String inputFromServer = bufferedReader.readLine();
                System.out.println(inputFromServer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
