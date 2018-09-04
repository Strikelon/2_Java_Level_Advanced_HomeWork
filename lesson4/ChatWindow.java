package java2.hm2_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ChatWindow extends JFrame {

    ArrayList<String> messageArray = new ArrayList<>();
    String chatAreaString;
    String YourNickName = "Александр Стрикалов";

    public ChatWindow(){
        setBounds(400, 100, 500, 600);
        setTitle("Chat Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel chatPanel = new JPanel();
        add(chatPanel,BorderLayout.CENTER);
        chatPanel.setLayout(new BorderLayout());
        JTextArea chatArea = new JTextArea();
        JScrollPane chatScroll = new JScrollPane(chatArea);
        chatPanel.add(chatScroll);

        JPanel bottomPanel = new JPanel();
        add(bottomPanel,BorderLayout.SOUTH);
        bottomPanel.setLayout(new FlowLayout());
        JTextField messageArea = new JTextField(25);
        bottomPanel.add(messageArea);
        JButton sendButton = new JButton("Отправить сообщение");
        bottomPanel.add(sendButton);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime date = LocalDateTime.now();
                messageArray.add(YourNickName+" ("+date+") :\n"+messageArea.getText()+"\n\n");
                messageArea.setText("");
                chatAreaString=messageArray.get(0);
                for(int i=1;i<messageArray.size();i++){
                    chatAreaString+=messageArray.get(i);
                }
                chatArea.setText(chatAreaString);
            }
        });



        messageArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime date = LocalDateTime.now();
                messageArray.add(YourNickName+" ("+date+") :\n"+messageArea.getText()+"\n\n");
                messageArea.setText("");
                chatAreaString=messageArray.get(0);
                for(int i=1;i<messageArray.size();i++){
                    chatAreaString+=messageArray.get(i);
                }
                chatArea.setText(chatAreaString);
            }
        });


        setVisible(true);
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatWindow();
            }
        });

    }
}
