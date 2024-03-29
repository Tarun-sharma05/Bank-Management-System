package Classes;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;

public class SignUpOne extends JFrame {
    SignUpOne(){
        setTitle("Sign Up");

        JLabel text = new JLabel("Page 2: Additional Details");
        text.setFont(new Font("Osward",Font.BOLD, 38));
        text.setBounds(400,200,200,30);
         add(text);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350, 200 );
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SignUpOne();
    }
}
