package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;


public class FastCash extends JFrame  implements ActionListener {


    JButton hundred, twoHundred, twoThousand, fiveHundred, withdraw, back, fiveThousand, tenThousand ;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 750);
        add(image);

        JLabel text = new JLabel("Please Select Your Withdrawal Amount.");
        text.setBounds(160,250,400, 30 );
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD, 14));
        image.add(text);

         hundred = new JButton("100");
        hundred.setBounds(160, 350, 100, 20);
        hundred.setBackground(Color.WHITE);
        hundred.setFont(new Font("Raleway",Font.BOLD, 16));
        hundred.addActionListener(this);
        image.add(hundred);

         twoThousand = new JButton("2000");
        twoThousand.setBounds(410, 350, 100, 20);
        twoThousand.setBackground(Color.WHITE);
        twoThousand.setFont(new Font("Raleway",Font.BOLD, 16));
        twoThousand.addActionListener(this);
        image.add(twoThousand);

         twoHundred = new JButton("200");
        twoHundred.setBounds(160, 380, 120, 20);
        twoHundred.setBackground(Color.WHITE);
        twoHundred.setFont(new Font("Raleway",Font.BOLD, 16));
        twoHundred.addActionListener(this);
        image.add(twoHundred);

        fiveHundred = new JButton("500");
        fiveHundred.setBounds(160, 410, 120, 20);
        fiveHundred.setBackground(Color.WHITE);
        fiveHundred.setFont(new Font("Raleway",Font.BOLD, 16));
        fiveHundred.addActionListener(this);
        image.add(fiveHundred);

        fiveThousand = new JButton("5000");
        fiveThousand.setBounds(410, 380, 100, 20);
        fiveThousand.setBackground(Color.WHITE);
        fiveThousand.setFont(new Font("Raleway",Font.BOLD, 16));
        fiveThousand.addActionListener(this);
        image.add(fiveThousand);

        tenThousand = new JButton("10000");
        tenThousand.setBounds(410, 410, 100, 20);
        tenThousand.setBackground(Color.WHITE);
        tenThousand.setFont(new Font("Raleway",Font.BOLD, 16));
        tenThousand.addActionListener(this);
        image.add(tenThousand);


//        withdraw = new JButton("Withdraw");
//        withdraw.setBounds(390, 435, 120, 20);
//        withdraw.setBackground(Color.WHITE);
//        withdraw.setFont(new Font("Raleway",Font.BOLD, 16));
//        withdraw.addActionListener(this);
//        image.add(withdraw);

        back = new JButton("Back");
        back.setBounds(160, 435, 100, 20);
        back.setBackground(Color.WHITE);
        back.setFont(new Font("Raleway",Font.BOLD, 16));
        back.addActionListener(this);
        image.add(back);





        setLayout(null);
        setSize(900, 700);
        setLocation(300, 0);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//
    public  void actionPerformed(ActionEvent ae){

            try {
                String amountNo = ((JButton) ae.getSource()).getText();
                Conn c = new Conn();

               ResultSet resultSet = c.s.executeQuery("SELECT * from bank WHERE pinnumber = '" + pinnumber + "'");
             //   ResultSet resultSet = c.s.executeQuery("SELECT SUM(CASE WHEN type = 'amount' THEN amountNo ELSE -amountNo END) AS balance FROM bank WHERE pinnumber = '" + pinnumber + "'");


                int balance = 0;
                while (resultSet.next()) {

                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amountNo"));
                    } else if (resultSet.getString("type").equals("Withdrawal")) {
                        balance -= Integer.parseInt(resultSet.getString("amountNo"));
                    }
                } String num = "17";
                if (ae.getSource() != back && balance < Integer.parseInt(amountNo)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
         if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
                 else {
                    Date date = new Date();
                    String query = "INSERT INTO bank (pinnumber, date, type, amountNo) VALUES('" + pinnumber + "', '" + date + "', 'Withdrawal', '" + amountNo + "')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "RS " + amountNo + " Debited Succesfully");

                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }



    ////////////////////////////////////////////////////////
//
//    public void actionPerformed(ActionEvent ae) {
//        try {
//            String amountNo = ((JButton)ae.getSource()).getText(); //k
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
//            int balance = 0;
//            while (rs.next()) {
//                if (rs.getString("type").equals("Deposit")) {
//                    balance += Integer.parseInt(rs.getString("amountNo"));
//                } else {
//                    balance -= Integer.parseInt(rs.getString("amountNo"));
//                }
//            } String num = "17";
//            if (ae.getSource() != back && balance < Integer.parseInt(amountNo)) {
//                JOptionPane.showMessageDialog(null, "Insuffient Balance");
//                return;
//            }
//
//            if (ae.getSource() == back) {
//                this.setVisible(false);
//                new Transactions(pinnumber).setVisible(true);
//            }else{
//                Date date = new Date();
//                c.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawal', '"+amountNo+"')");
//                JOptionPane.showMessageDialog(null, "Rs. "+amountNo+" Debited Successfully");
//
//                setVisible(false);
//                new Transactions(pinnumber).setVisible(true);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    public static void main(String[] args) {
        new FastCash("");
    }
}

