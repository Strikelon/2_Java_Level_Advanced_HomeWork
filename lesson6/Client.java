package java2.hm2_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 8189))
        {
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
                            out.writeUTF("Client: " +msg);
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
