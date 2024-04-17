package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signUp;
    JTextField cardTextField;
    JPasswordField pinTextField;
    JLabel cardNo, pin;

        Login(){
            setTitle("Automated Teller Machine");
            setLayout(null);
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel label = new JLabel(i3);
            label.setBounds(70, 10, 100,100);
            add(label);

            JLabel text = new JLabel("Welcome To ATM");
            text.setFont(new Font("Osward",Font.BOLD,38));
            text.setBounds(200, 40,450,40);
            add(text);

             cardNo = new JLabel("Card No:");
            cardNo.setFont(new Font("Raleway",Font.BOLD, 28));
            cardNo.setBounds(120,150,150,40);
            add(cardNo);

            cardTextField = new JTextField();
            cardTextField.setBounds(260, 160,250,30);
            cardTextField.setFont(new Font("Arial",Font.BOLD,14) );
            add(cardTextField);

            pin = new JLabel("PIN:");
            pin.setFont(new Font("Raleway",Font.BOLD,28));
            pin.setBounds(120,220,400,40);
            add(pin);

             pinTextField = new JPasswordField();
            pinTextField.setBounds(260,220,250,30);
            pinTextField.setFont(new Font("Arial",Font.BOLD, 14));
            add(pinTextField);

            //BUTTONS
            login = new JButton("SIGN IN");
            login.setBounds(270,300,100,30);
            login.setBackground(Color.black);
            login.setForeground(Color.WHITE);
            login.addActionListener(this);
            add(login);

            clear = new JButton("CLEAR");
            clear.setBounds(400,300,100,30);
            clear.setBackground(Color.BLACK);
            clear.setForeground(Color.WHITE);
            clear.addActionListener(this);
            add(clear);

             signUp = new JButton("SIGN UP");
            signUp.setBounds(270,350,230,30);
            signUp.setBackground(Color.BLACK);
            signUp.setForeground(Color.WHITE);
            signUp.addActionListener(this);
            add(signUp);


            getContentPane().setBackground(Color.WHITE);

            setSize(800,450);
            setVisible(true);
            setLocation(350,200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void actionPerformed(ActionEvent ae){
          if (ae.getSource() == clear){
                cardTextField.setText("");
                pinTextField.setText("");
          }else if (ae.getSource() == login){
              String cardNumber = cardTextField.getText();
              String pinnumber = pinTextField.getText();
              Conn c = new Conn();
              String querry = "select * from login where cardNumber = '"+ cardNumber +"' and Pinnumber =  '"+ pinnumber +"'";
              try{
                ResultSet resultSet =  c.s.executeQuery(querry);
                if (resultSet.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Incorect pin or card Number");
                }
              }catch (Exception e){
                  System.out.println(e);
              }
          }else if(ae.getSource() == signUp){
                setVisible(false);
                new SignUpOne().setVisible(true);
          }
        }


    public static void main(String[] args) {
        new Login();


    }

}
