package Classes;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignUp2 extends JFrame implements ActionListener {
    long random;
    JTextField aadharTF, panNoTF;
    JButton next;
    JRadioButton sYes, sNo, eYes,eNo;
    ButtonGroup senior,existing;
    JComboBox educationBox, religionBox, categoryBox, incomeBox, occupationBox;
    String formno;
    SignUp2(String formno) {
       this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE : 2 ");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        //RELIGION LABEL
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(115, 140, 100, 30);
        add(religion);

        String valReligion[]= {"Hindu","Muslim","Sikh","Christian"};
        //JCOMBOBOX FOR RELIGION
         religionBox = new JComboBox(valReligion);
        religionBox.setFont(new Font("Raleway", Font.BOLD, 14));
        religionBox.setBounds(200, 140, 250, 30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);

            //CATEGORY LABEL
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(105, 180, 200, 30);
        add(category);

        String valCategory[] ={"General","SC/ST", "OBC", "EWS"};
        //JCOMBOBOX FOR CATEGORY
         categoryBox = new JComboBox(valCategory);
        categoryBox.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryBox.setBounds(200, 180, 250, 30);
        categoryBox.setBackground(Color.WHITE);
        add(categoryBox);
        //INCOME LABEL
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(122, 220, 100, 30);
        add(income);
        String valIncome[] = {"Null", "<1,50,000", "<2,50,000","<5,00,000", "Upto 10,00,000"};
        //JCOMBOBOX FOR INCOME
         incomeBox = new JComboBox(valIncome);
        incomeBox.setBackground(Color.WHITE);
        incomeBox.setBounds(200, 220, 250, 30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);

        //EDUCATIONAL QUALIFIACATION LABEL
        JLabel education = new JLabel("Education:");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(80, 260, 200, 30);
        add(education);
        String valEducation[] = {"10th Pass","12th Pass","Undergraduate","Graduate","Postgraduate","Diploma"};
        //JCOMBOBOX FOR EDUCATIONAL QUALIFICATION
         educationBox = new JComboBox(valEducation);
        educationBox.setBounds(200, 260, 250, 30);
        educationBox.setBackground(Color.WHITE);
        add(educationBox);
        JLabel qualifiacation = new JLabel("Qualification");
        qualifiacation.setFont(new Font("Releway", Font.BOLD, 20));
        qualifiacation.setBounds(70, 278, 200, 30);
        add(qualifiacation);

        //OCCUPATION LABEL
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(83, 340, 200, 30);
        add(occupation);
        String valOccupation[] ={"Salaried", "Self-Employed", "Bussinesman", "Student","Retired","Other"};
         occupationBox = new JComboBox(valOccupation);
        occupationBox.setBackground(Color.WHITE);
        occupationBox.setBounds(200, 340, 250, 30);
        add(occupationBox);
         //PAN NO. LABEL
        JLabel panNo = new JLabel("PAN No:");
        panNo.setFont(new Font("Raleway", Font.BOLD, 20));
        panNo.setBounds(115, 380, 100, 30);
        add(panNo);
        //PAN NO. TEXTF
         panNoTF = new JTextField();
        panNoTF.setFont(new Font("Raleway", Font.BOLD, 14));
        panNoTF.setBounds(200, 380, 250, 30);
        add(panNoTF);

          //AADHAR NO LABEL
        JLabel aadharNo = new JLabel("Aadhar No:");
        aadharNo.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharNo.setBounds(90, 420, 150, 30);
        add(aadharNo);
        //AADHAR NO. TEXTF
         aadharTF = new JTextField();
        aadharTF.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTF.setBounds(200, 420, 250, 30);
        add(aadharTF);

        //SENIOR CITIZEN LABEL
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(60, 460, 200, 30);
        add(seniorCitizen);
        //SENIOR CITIZEN RADIOBUTTON
         sYes = new JRadioButton("YES");
        sYes.setFont(new Font("Raleway", Font.BOLD, 14));
        sYes.setBounds(200, 460, 100, 30);
        sYes.setBackground(Color.WHITE);
        add(sYes);
         sNo = new JRadioButton("NO");
        sNo.setBounds(330, 460, 100,30);
         sNo.setBackground(Color.WHITE);
        add(sNo);
        //BUTTONGROUP FOR SENIOR CITIZEN "YEES" OR "NO"
         senior = new ButtonGroup();  //ButtonGroup for senior citizen
        senior.add(sYes);
        senior.add(sNo);

        //EXISTIING ACCOUNT HOLDER LABEL
        JLabel existingAcc = new JLabel("Existing Account:");
        existingAcc.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAcc.setBounds(30, 500, 200, 30);
        add(existingAcc);
        //EXISTING ACCOUNT HOLDER RADIO BUTTON
         eYes = new JRadioButton("YES");
        eYes.setFont(new Font("Raleway", Font.BOLD, 14));
        eYes.setBounds(200, 500, 100, 30);
        eYes.setBackground(Color.WHITE);
        add(eYes);
         eNo = new JRadioButton("NO");
        eNo.setBounds(330, 500, 100,30);
        eNo.setBackground(Color.WHITE);
        add(eNo);
         //EXISTING GROUP BUTTON
         existing = new ButtonGroup();
        existing.add(eYes);
        existing.add(eNo);

        //NEXT BUTTON
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(300, 600, 100, 30);
        next.addActionListener((ActionListener)this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 200);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){

        String sReligion =(String) religionBox.getSelectedItem();
        String sCategory = (String) categoryBox.getSelectedItem();
        String sIncome = (String) incomeBox.getSelectedItem();
        String sEducation = (String) educationBox.getSelectedItem();
        String sOccupation = (String) occupationBox.getSelectedItem();
        String sPan =  panNoTF.getText();
        String sAadhar = aadharTF.getText();

        //SENIOR CITIZEN CONDITION YES OR NO;
        String sSenior_Citizen = null;
        if(sYes.isSelected()){
            sSenior_Citizen = "YES";
        } else if (sNo.isSelected()) {
            sSenior_Citizen = "NO";
        }

        String sExisting_Acc= null;
        if(eYes.isSelected()){
            sExisting_Acc =  "YES";
        } else if (eNo.isSelected()) {
            sExisting_Acc = "NO";
        }



        try {


                Conn c = new Conn();

                String querry = "insert into Additional_Info(formno, sReligion, sCategory, sIncome, sEducation, sOccupation, sPan, sAadhar, sSenior_Citizen, sExisting_Acc)" + "VALUES('"+formno+"','" +sReligion+"',  '"+sCategory+ "', '"+sIncome+"',  '"+sEducation+"', '"+sOccupation+"','"+sPan+"', '"+sAadhar+"',  '"+sSenior_Citizen+"',  '"+sExisting_Acc+"')";
                c.s.executeUpdate(querry);
             if (ae.getSource() == next)
                setVisible(false);
             new SignUpThree(formno).setVisible(true);
            }
        catch (Exception e){
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        new SignUp2("").setVisible(true);

    }
}

