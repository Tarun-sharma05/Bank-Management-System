package Classes;
import com.sun.tools.jconsole.JConsoleContext;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.io.Console;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame {
    SignUpOne(){
        setLayout(null);
        setTitle("Sign Up");
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO: " + random );
        formno.setFont(new Font("Raleway", Font.BOLD,30));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Ralewat",Font.BOLD, 22));
        personalDetails.setBounds(290,80,400,30);
         add(personalDetails);

         JLabel name = new JLabel("Name:");
         name.setFont(new Font("Raleway", Font.BOLD,20));
         name.setBounds(115,140,100,30);
         add(name);
         JTextField nameTF = new JTextField();
         nameTF.setFont(new Font("Raleway",Font.BOLD,14));
         nameTF.setBounds(200,140,250,30);
         add(nameTF);

         JLabel fathersNmae = new JLabel("Father's Name:");
         fathersNmae.setFont(new Font("Raleway",Font.BOLD, 20));
         fathersNmae.setBounds(15,180,200,30);
         add(fathersNmae);
         JTextField fatherNameTF = new JTextField();
          fatherNameTF.setFont(new Font("Raleway",Font.BOLD,14));
         fatherNameTF.setBounds(200,180,250,30);
         add(fatherNameTF);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,220,100,30);
        add(gender);
        JRadioButton male = new JRadioButton("Male");
         male.setBackground(Color.WHITE);
        male.setBounds(200,220,100,30);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setBounds(300,220,100,30);
        add(female);

        ButtonGroup genderGroup =  new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

         JLabel Dob = new JLabel("Date Of Birth:");
         Dob.setFont(new Font("Raleway",Font.BOLD,20));
         Dob.setBounds(20,260,200,30);
         add(Dob);
         JDateChooser dateChooser = new JDateChooser();
         dateChooser.setBounds(200,260,250,30);
         dateChooser.setForeground(Color.BLACK);
         add(dateChooser);



         JLabel email = new JLabel("Email Address:");
         email.setFont(new Font("Releway",Font.BOLD,20));
         email.setBounds(20,300,200,30);
         add(email);
        JTextField emailTF = new JTextField();
         emailTF.setFont(new Font("Raleway",Font.BOLD,14));
        emailTF.setBounds(200,300,250,30);
        add(emailTF);


         JLabel marriage = new JLabel("Merital Status:");
         marriage.setFont(new Font("Raleway",Font.BOLD,20));
         marriage.setBounds(20,340,200,30);
         add(marriage);

         JRadioButton married = new JRadioButton("Married");
         married.setBackground(Color.WHITE);
         married.setBounds(200,340,80,30);
         add(married);
         JRadioButton Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBackground(Color.WHITE);
        Unmarried.setBounds(300,340,100,30);
        add(Unmarried);

        JRadioButton other = new JRadioButton("Other");
         other.setBackground(Color.WHITE);
         other.setBounds(400,340,100,30);
        add(other);


        ButtonGroup marriegGroup = new ButtonGroup();
        marriegGroup.add(married);
        marriegGroup.add(Unmarried);
        marriegGroup.add(other);



         JLabel address = new JLabel("Address:");
         address.setFont(new Font("Raleway",Font.BOLD,20));
         address.setBounds(90,380,100,30);
         add(address);
        JTextField addressTF = new JTextField();
        addressTF.setFont(new Font("Raleway",Font.BOLD,14));
        addressTF.setBounds(200,380,250,30);
        add(addressTF);

         JLabel city = new JLabel("City:");
         city.setFont(new Font("Raleway",Font.BOLD,20));
         city.setBounds(135,420,100,30);
         add(city);
        JTextField cityTF = new JTextField();
        cityTF.setFont(new Font("Raleway",Font.BOLD,14));
        cityTF.setBounds(200,420,250,30);
        add(cityTF);

         JLabel state = new JLabel("State:");
         state.setFont(new Font("Raleway",Font.BOLD,20));
         state.setBounds(120,460,100,30);
         add(state);
        JTextField stateTF = new JTextField();
        stateTF.setFont(new Font("Raleway",Font.BOLD,14));
        stateTF.setBounds(200,460,250,30);
        add(stateTF);

         JLabel pincode = new JLabel("Pincode:");
         pincode.setFont(new Font("Raleway",Font.BOLD,20));
         pincode.setBounds(90,500,100,30);
         add(pincode);
         JTextField pincodeTF = new JTextField();
        pincodeTF.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTF.setBounds(200,500,250,30);
        add(pincodeTF);

        //NEXT BUTTON
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(300,600,100,30);
        add(next);

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
