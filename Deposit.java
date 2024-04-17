package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    JButton back, deposit;
      JTextField amount;
       String pinnumber;
    Deposit(String pinnumber){
           this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,720, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,720);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setBounds(160,250,400,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD, 14));
        image.add(text);

         amount = new JTextField();
        amount.setBounds(160, 285, 250, 30);
        amount.setBackground(Color.WHITE);
        image.add(amount);

         deposit = new JButton("Deposit");
        deposit.setBounds(400, 390, 100, 20);
        deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
         image.add(deposit);

         back = new JButton("Back");
        back.setBounds(400, 420, 100, 20);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);

        setLayout(null);
        setSize(900,700);
        setLocation(300,0);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else if (ae.getSource() == deposit) {
              String amountNo = amount.getText();
              Date date = new Date();
              if (amountNo.equals("")){
                  JOptionPane.showMessageDialog(null, "Please enter the amount.");
              } else {
                  try {
                      Conn c = new Conn();
                      String query = "INSERT INTO bank (pinnumber, date, type, amountNo) VALUES('"+pinnumber+"', '"+date+"', 'Deposit', '"+amountNo+"')";

                      c.s.executeUpdate(query);
                      JOptionPane.showMessageDialog(null, "RS" + amountNo + "Deposited succesfully");
                      setVisible(false);
                      new Transactions(pinnumber).setVisible(true);
                  }catch (Exception e){
                      System.out.println(e);
                  }


              }
        }
    }
    public static void main(String[] args) {
        new Withdrawal("");
    }
}
