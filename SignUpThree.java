package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpThree extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JRadioButton r1, r2,r3,r4;
    JButton submit, cancle;
    JCheckBox c1,c2, c3, c4, c5, c6, c7;
    String formno;
    SignUpThree(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE : 3");
         l1 = new JLabel("Page 3: Account Details");
        l1.setBounds(300,80,400,30);
        l1.setFont(new Font("Raleway",Font.BOLD, 22));
        add(l1);

        // ALL THE LABELS
        l2 = new JLabel("Account Types:");
        l2.setFont(new Font("Raleway",Font.BOLD,18));

        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Ralway",Font.BOLD,18));

        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway",Font.BOLD,18));

        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway",Font.BOLD,18));

        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway",Font.BOLD,18));

        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));

        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway",Font.BOLD,18));

        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway",Font.BOLD,18));

        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));

        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));

        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway",Font.BOLD,18));

        //ALL BUTTONS
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);

        cancle = new JButton("Cancel");
        cancle.setFont(new Font("Raleway",Font.BOLD,14));
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);

        //ALL THE CHECKBOX
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD,16));

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD,16));

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD,16));

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD,16));

        c5 = new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD,16));

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD,16));

        c7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD,16));

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(Color.WHITE);
        r1.setFont(new Font("Raleway", Font.BOLD,16));

        r2 = new JRadioButton("Fixed Deposit Accunt");
        r2.setBackground(Color.WHITE);
        r2.setFont(new Font("Raleway", Font.BOLD,16));

        r3 = new JRadioButton("Current Account");
        r3.setBackground(Color.WHITE);
        r3.setFont(new Font("Raleway", Font.BOLD,16));

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBackground(Color.WHITE);
        r4.setFont(new Font("Raleway", Font.BOLD,16));

        ButtonGroup groupAccunt = new ButtonGroup();
        groupAccunt.add(r1);
        groupAccunt.add(r2);
        groupAccunt.add(r3);
        groupAccunt.add(r4);

        //setBounds  FOR ALL THE LABELS
         l1.setBounds(280,40,400,40);
         add(l1);

         l2.setBounds(100,140,150,30);
         add(l2);

        r1.setBounds(250,140,200,30);
        add(r1);

        r2.setBounds(450,140,300,30);
        add(r2);

        r3.setBounds(250,180,170,30);
        add(r3);

        r4.setBounds(450,180,300,30);
        add(r4);

        l3.setBounds(115,220,200,30);
        add(l3);

        l4.setBounds(250,220,250,30);
        add(l4);

        l5.setBounds(250,240,250,20);
        add(l5);

        l6.setBounds(250,260, 500, 20);
        add(l6);

        l7.setBounds(200,300, 200,20);
        add(l7);

        l8.setBounds(250,295, 200,30);
        add(l8);

        l9.setBounds(250,320,200,20);
        add(l9);

        l10.setBounds(65,360,200,30);
        add(l10);

        c1.setBounds(250,360,150,30);
        add(c1);

        c2.setBounds(400,360,200,30);
        add(c2);

        c3.setBounds(600,360,200,30);
        add(c3);

        c4.setBounds(250,400,150,30);
        add(c4);

        c5.setBounds(400,400,200,30);
        add(c5);

        c6.setBounds(600,400,200,30);
        add(c6);

        c7.setBounds(100,450,700,30);
        add(c7);

        submit.setBounds(250,520,100,30);
        add(submit);

        cancle.setBounds(420,520,100,30);
        add(cancle);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(250, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener( this);
        cancle.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae){
        String accountType = null;
         if (ae.getSource() == submit){

             if (r1.isSelected()){
                 accountType = "Saving Account";
             } else if (r2.isSelected()) {
                 accountType = "Fixed Deposit Account";
             } else if (r3.isSelected()) {
                 accountType = "Current Account";
             } else if (r4.isSelected()) {
                 accountType = "Recurring Deposit Account";
             }
             Random ran = new Random();

             long first7  =  + ( ran.nextLong() % 9000000000L) + 5040936000000000L;
             String cardNumber = "" + Math.abs(first7);
             String pinnumber = "" + Math.abs((ran.nextLong() % 9000L) + 1000L);

             String facility = "";
             if(c1.isSelected()){
                 facility = facility + " ATM CARD";
             } else if (c2.isSelected()) {
                 facility = facility + " Internet Banking";
             } else if (c3.isSelected()) {
                 facility = facility + " Mobile Banking";
             } else if (c4.isSelected()) {
                 facility = facility + "Email & SMS Alerts";
             } else if (c5.isSelected()) {
                 facility = facility + " Cheque Book";
             } else if (c6.isSelected()) {
                 facility = facility + " E-Statement";
             }

             try{
                 if (accountType.equals("")){
                     JOptionPane.showMessageDialog(null, "Account type is required");
                 }else {
                     Conn c = new Conn();
                     String querry1 = "Insert into Account_details(formno, accountType, cardNumber, pinnumber, facility)"+ "VALUES('"+formno+"', '"+accountType+"', '"+cardNumber+"', '"+pinnumber+"', '"+facility+"' )";
                     String querry2 = "Insert into login(formno,  cardNumber, pinnumber)"+ "VALUES('"+formno+"', '"+cardNumber+"', '"+pinnumber+"' )";

                     c.s.executeUpdate(querry1);
                     c.s.executeUpdate(querry2);
                     JOptionPane.showMessageDialog(null, "Card Number:" + cardNumber +  "\nPin:" + pinnumber);

                     setVisible(false);
                     new Deposit(pinnumber).setVisible(true);
                 }
             }catch (Exception e){
                 System.out.println(e);
             }

         }else if (ae.getSource() == cancle){

         }

    }


    public static void main(String[] args) {
        new SignUpThree("");
    }
}


