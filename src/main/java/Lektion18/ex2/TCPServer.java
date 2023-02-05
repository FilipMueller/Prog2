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
            Hangman hangman = new Hangman();
            while (!hangman.gameComplete) {
                String inputFromClient = bufferedReader.readLine();
                hangman.updateWord(inputFromClient);
                if (hangman.gameComplete) {
                    printWriter.println("You Won! The Word is: " + hangman.getChosenWordString());
                    printWriter.flush();
                }
                printWriter.println(hangman.getCharsGuessed());
                printWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
