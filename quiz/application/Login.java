package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 580, 500);
        add(image);
        
        JLabel heading = new JLabel("FUN");
        heading.setBounds(810, 60, 300, 70);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 65));
        heading.setForeground(new Color(35, 35, 250));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(760, 150, 300, 40);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 35));
        name.setForeground(new Color(35, 35, 250));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 40);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 35));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(915, 300, 120, 30);
        rules.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        rules.setBackground(new Color(35, 35, 250));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(735, 300, 120, 30);
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        back.setBackground(new Color(35, 35, 250));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1150, 500);
        setLocation(120, 120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
