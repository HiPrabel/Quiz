package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to FUN ");
        heading.setBounds(50, 20, 700, 90);
        heading.setFont(new Font("Ink Free", Font.BOLD, 55));
        heading.setForeground(new Color(35, 35, 250));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(50, 90, 700, 350);
        rules.setFont(new Font("Arial Rounded MT Bold", Font.ROMAN_BASELINE, 20));
        rules.setForeground(new Color(250, 70, 0));
        rules.setText(
            "<html>"+ 
                "1. IT CONSISTS OF 10 OBJECTIVE QUESTIONS" + "<br><br>" +
                "2. EACH QUESTIONS HAS 4 CHOICES" + "<br><br>" +
                "3. EACH QUESTIONS HAS 10 MARKS" + "<br><br>" +
                "4. YOU CAN USE 50-50 OPTION FOR ANY ONE QUESTION" + "<br><br>" +
                "4. SCORE WILL BE SHOWED AT THE LAST " + "<br><br>" +
                "4. ALL THE BEST" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(150, 450, 120, 35);
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        back.setBackground(new Color(35, 35, 250));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(500, 450, 120, 35);
        start.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        start.setBackground(new Color(35, 35, 250));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 620);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
