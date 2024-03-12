package Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        System.out.println("Server starting!");
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket accept = serverSocket.accept();
            System.out.println("Server starting!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}