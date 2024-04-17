package Classes;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {
    String pinnumber;
    MiniStatement(String pinnumber){
        this.pinnumber = pinnumber;

             setTitle("Mini Statement");

             JLabel mini = new JLabel();
             mini.setBounds(20,140,400,200);
             add(mini);

             JLabel bank = new JLabel("Indian Bank");
             bank.setBounds(150, 20,100,20);
             bank.setForeground(Color.BLACK);
             add(bank);

             JLabel card = new JLabel();
             card.setBounds(20,80,300,20);
              add(card);

              JLabel balance = new JLabel();
              balance.setBounds(20,400,300,20);
              add(balance);

              //////////////////////////////////////
              try{
                  Conn c = new Conn();
                  ResultSet resultSet = c.s.executeQuery("SELECT * from login where pinnumber = '"+pinnumber+"'");

                  while (resultSet.next()){
                      card.setText("Card Number:" + resultSet.getString("cardNumber").substring(0,4) + "XXXXXXXX" + resultSet.getString("cardNumber").substring(12));
                  }
              }catch (Exception e){
                  System.out.println(e);
              }

              try {
                  int bal = 0;
                  Conn c = new Conn();
                  ResultSet resultSet = c.s.executeQuery("SELECT * from bank where pinnumber = '"+pinnumber+"'");
                  while (resultSet.next()){
                      mini.setText(mini.getText() + "<html>" + resultSet.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amountNo") + "<br><br><html>");
                      if (resultSet.getString("type").equals("Deposit")){
                          bal += Integer.parseInt(resultSet.getString("amountNo"));
                      }else {
                          bal -= Integer.parseInt(resultSet.getString("amountNo"));
                      }
                  }
                  balance.setText("Your Current Account Balance Is Rupees:"+ bal);
              }catch (Exception e){
                  System.out.println(e);
              }



              /////////////////////////////////////
         setLayout(null);
         setSize(400,600);
         setLocation(20,0);
         //setUndecorated(true);
         setVisible(true);
        // getContentPane().setBackground(Color.WHITE);

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
          new MiniStatement("");


    }
}
