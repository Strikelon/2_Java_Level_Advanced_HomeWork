package java2.hm2_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {



    public static void main(String[] args) {


        try(ServerSocket serverSocket = new ServerSocket(8189);
            Socket socket = serverSocket.accept())
        {

            System.out.println("Client connected");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        while (true) {
                            String msg = in.readUTF();
                            System.out.println(msg);
                        }
                    }catch (IOException ex){
                        ex.printStackTrace();
                    }
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                    while (true) {
                        String msg = scanner.nextLine();
                        out.writeUTF("Server: " +msg);
                    }
                }catch (IOException ex){
                        ex.printStackTrace();
                    }
                }
            });


            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }



        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
