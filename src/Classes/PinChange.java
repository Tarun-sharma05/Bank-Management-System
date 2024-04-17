package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PinChange extends JFrame implements ActionListener  {
    JButton back, change;
    JPasswordField newPinPF, rePinPF;
    JLabel pinText, rePinText;

    String pinnumber;
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 750);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(220, 250, 400, 30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD, 18));
        image.add(text);

        pinText = new JLabel("New Pin:");
        pinText.setBounds(160,290, 150, 30);
        pinText.setFont(new Font("Raleway", Font.BOLD, 16));
        pinText.setForeground(Color.WHITE);
        image.add(pinText);

        newPinPF = new JPasswordField();
        newPinPF.setBounds(250, 290, 200,25);
        newPinPF.setFont(new Font("Raleway", Font.BOLD, 16));
        newPinPF.setBackground(Color.WHITE);
        image.add(newPinPF);

        rePinText = new JLabel("Re-Enter Pin:");
        rePinText.setBounds(160,340, 300, 30);
        rePinText.setFont(new Font("Raleway", Font.BOLD, 16));
        rePinText.setForeground(Color.WHITE);
        image.add(rePinText);

        rePinPF = new JPasswordField();
        rePinPF.setBounds(270, 340, 200,25);
        rePinPF.setFont(new Font("Raleway", Font.BOLD, 16));
        rePinPF.setBackground(Color.WHITE);
        image.add(rePinPF);

        change = new JButton("Change");
        change.setBounds(400, 390, 100, 20);
        change.setBackground(Color.WHITE);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(400, 420, 100, 20);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);

        setLayout(null);
        setSize(900, 700);
        setLocation(300, 0);
        getContentPane().setBackground(Color.WHITE);
        //setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public  void actionPerformed(ActionEvent ae){
            try {
                String npin = newPinPF.getText();
                String rpin = rePinPF.getText();
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered pin Does not match");
                    return;
                }
                if(ae.getSource() == change) {
                    if (npin.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter new pin");
                        return;
                    }
                    if (rpin.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please re-enter new pin");
                        return;
                    }
                    Conn c = new Conn();
                    String query1 = "UPDATE login set pinnumber = '" + rpin + "' where pinnumber = '" + pinnumber + "'";
                    String query2 = "UPDATE bank set pinnumber = '" + rpin + "' where pinnumber = '" + pinnumber + "'";
                    String query3 = "UPDATE account_details set pinnumber = '" + rpin + "' where pinnumber = '" + pinnumber + "'";

                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    c.s.executeUpdate(query3);

                    JOptionPane.showMessageDialog(null, "PIN Changed Succesfully");

                    setVisible(false);
                    new Transactions(rpin).setVisible(true);
                }
                else {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }


            } catch (Exception e) {
                System.out.println(e);
            }
         }



public static void main(String[] args) {
    new PinChange("").setVisible(true);
}
}





