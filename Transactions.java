package Classes;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Transactions extends JFrame  implements ActionListener {


    JButton deposit, cashWithdraw, fastCash, balanceInquiry, exit, pinchange, miniStatement;
    String pinnumber;

    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 750);
        add(image);

        JLabel text = new JLabel("Please Select Your Transection.");
        text.setBounds(160, 250, 400, 30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 14));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(160, 335, 100, 20);
        deposit.setBackground(Color.WHITE);
        deposit.setFont(new Font("Raleway", Font.BOLD, 16));
        deposit.addActionListener(this);
        image.add(deposit);

        cashWithdraw = new JButton("Cash Withdrawal");
        cashWithdraw.setBounds(340, 335, 170, 20);
        cashWithdraw.setBackground(Color.WHITE);
        cashWithdraw.setFont(new Font("Raleway", Font.BOLD, 16));
        cashWithdraw.addActionListener(this);
        image.add(cashWithdraw);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(160, 365, 120, 20);
        fastCash.setBackground(Color.WHITE);
        fastCash.setFont(new Font("Raleway", Font.BOLD, 16));
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(340, 365, 170, 20);
        miniStatement.setBackground(Color.WHITE);
        miniStatement.setFont(new Font("Raleway", Font.BOLD, 16));
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(160, 395, 150, 20);
        pinchange.setBackground(Color.WHITE);
        pinchange.setFont(new Font("Raleway", Font.BOLD, 16));
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceInquiry = new JButton("Balance Inquiry");
        balanceInquiry.setBounds(340, 395, 170, 20);
        balanceInquiry.setBackground(Color.WHITE);
        balanceInquiry.setFont(new Font("Raleway", Font.BOLD, 16));
        balanceInquiry.addActionListener(this);
        image.add(balanceInquiry);

        exit = new JButton("Exit");
        exit.setBounds(160, 425, 150, 20);
        exit.setBackground(Color.WHITE);
        exit.setFont(new Font("Raleway", Font.BOLD, 16));
        exit.addActionListener(this);
        image.add(exit);


        setLayout(null);
        setSize(900, 700);
        setLocation(300, 0);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        } else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if (ae.getSource() == cashWithdraw) {
            setVisible(false);
            new Withdrawal(pinnumber).setVisible(true);
        } else if (ae.getSource() == fastCash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if (ae.getSource() == pinchange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if (ae.getSource() == balanceInquiry) {
            setVisible(false);
            new BalanceEnquiery(pinnumber).setVisible(true);
        }
        else if (ae.getSource() == miniStatement){

            new MiniStatement(pinnumber).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Transactions("");
    }
}
