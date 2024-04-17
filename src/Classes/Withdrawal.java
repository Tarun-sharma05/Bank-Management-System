package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    JButton back, withdraw;
    JTextField amount;
    String pinnumber;
    Withdrawal(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,720, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,720);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setBounds(160,250,400,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD, 14));
        image.add(text);

        amount = new JTextField();
        amount.setBounds(160, 285, 250, 30);
        amount.setBackground(Color.WHITE);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(400, 390, 100, 20);
        withdraw.setBackground(Color.WHITE);
        withdraw.addActionListener(this);
        image.add(withdraw);

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
        } else if (ae.getSource() == withdraw) {
            String amountNo = amount.getText();
            Date date = new Date();
            if (amountNo.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount.");
            } else {
                try {
                    Conn c = new Conn();
                    String query = "INSERT INTO bank (pinnumber, date, type, amountNo) VALUES('"+pinnumber+"', '"+date+"', 'Withdrawal', '"+amountNo+"')";

                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "RS " + amountNo + " Withdrawen succesfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(false);
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

