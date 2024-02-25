import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ui extends JFrame {
    
    ui(){

        //vars
        //ImageIcon pic = new ImageIcon("C:\\Users\\juhtm\\OneDrive\\Documents\\MMDC\\s_tasks\\motorph\\imgs\\logo.jpg");
        Border loginBorder = BorderFactory.createLineBorder(Color.black,3);
        // Border titleBorder = BorderFactory.createLineBorder(Color.black,3);
        //add panel
        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(new Color(0xFFFFFF));
        loginPanel.setOpaque(true);
        loginPanel.setBorder(loginBorder);
        loginPanel.setBounds(0, 0, 350, 450);
        loginPanel.setLayout(new FlowLayout());
        JButton loginButton = new JButton();
 
        //set MotorPH title
        JLabel title = new JLabel();
        title.setText("MotorPH");
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.TOP);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setFont(new Font("Arial Black",Font.PLAIN,40));
        title.setBounds(0, 0, 250, 70);
        // title.setBorder(titleBorder);

        //login label
        JLabel desc = new JLabel();
        desc.setText("Log in to your Account");
        desc.setBounds(10, 20, 80, 25);

        //email label
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(10, 20, 80, 25);

        //emailText label
        JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 20, 165, 25);

        //password label
        JLabel password = new JLabel();
        email.setText("Password");
        email.setBounds(10, 20, 80, 25);

        //Text passwordText label
        JTextField passwordText = new JTextField(20);
        emailText.setBounds(100, 20, 165, 25);

        //add stuff here
        JFrame ui =  new JFrame();
        this.setTitle("MotorPH");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(960,640);
        setMinimumSize(new Dimension(960, 640));
        this.setVisible(true);
        // loginPanel.setLayout(null);
        this.add(loginPanel);
        loginPanel.add(title);
        loginPanel.add(desc);
        loginPanel.add(email);
        loginPanel.add(emailText);
        loginPanel.add(loginButton);
        loginPanel.add(password);
        // loginPanel.add(passwordText);
         
        
        //add logo icon
        ImageIcon image = new ImageIcon("C:\\Users\\juhtm\\OneDrive\\Documents\\MMDC\\s_tasks\\motorph\\imgs\\logo.jpg"); //not working
        this.setIconImage(image.getImage());


    }
}
