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
            boolean gameCompleted = false;
            while (!gameCompleted) {
                String inputFromClient = scanner.nextLine();
                printWriter.println(inputFromClient);
                printWriter.flush();
                String inputFromServer = bufferedReader.readLine();
                if (inputFromServer.contains("You Won!")) {
                    gameCompleted = true;
                }
                System.out.println(inputFromServer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
