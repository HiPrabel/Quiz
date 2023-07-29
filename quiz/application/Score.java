package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(300, 150, 850, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/scoore.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30, 150, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing FUN");
        heading.setBounds(20, 50, 700, 50);
        heading.setFont(new Font("Ink Free", Font.PLAIN, 45));
        add(heading);

        JLabel cong = new JLabel("Congratulations! ");
        cong.setBounds(400, 200, 400, 50);
        cong.setFont(new Font("Ravie", Font.PLAIN, 32));
        add(cong);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(460, 250, 450, 35);
        lblscore.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(480, 330, 180, 35);
        submit.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        submit.setBackground(new Color(60,200,10));
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
