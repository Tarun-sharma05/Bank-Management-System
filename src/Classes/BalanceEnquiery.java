package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiery extends JFrame implements ActionListener{
    String pinnumber;
    BalanceEnquiery(String pinnumber){
    this.pinnumber = pinnumber;

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);

      JButton  back = new JButton("Back");
        back.setBounds(400, 400, 100, 20);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);

        ///////////////////////////////////////
         int balance = 0;
        try {
            Conn c = new Conn();
            ResultSet resultSet = c.s.executeQuery("SELECT * from bank where pinnumber = '"+pinnumber+"' ");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amountNo"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amountNo"));
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }

        JLabel text = new JLabel("Your Current Account Balance Is " +balance);
        text.setForeground(Color.WHITE);
        text.setBounds(200,250,400,30);
        text.setFont(new Font("Raleway",Font.BOLD, 16));
        image.add(text);


         //////////////////////////////////////
          setLayout(null);
          setSize(900,700);
          setLocation(300,0);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
      new Transactions(pinnumber).setVisible(true);
    }


    public static void main(String[] args) {
        new BalanceEnquiery("");
    }
}
