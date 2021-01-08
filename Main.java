package Client;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Main {

    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        var logo = new ImageIcon(".//Java//Client//res//logo.jpg", "Das bist das Logo!");

        ImageIcon image = new ImageIcon(".//Java//Client//res//logo.jpg", "Das bist das Logo!");

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(0, 0, 250, 250);
        //whitePanel.setOpaque(true);
        //whitePanel.setVisible(true);
        
        JLabel label = new JLabel();
        label.setText("Taskkiller");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xFFFFFF));
        label.setFont(new Font("Arial Black",Font.PLAIN,20)); //Font auswählen
        label.setIconTextGap(100); //Gap Text - Image
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIcon(image);

        JButton processKillerInput = new JButton();
        processKillerInput.setBounds(200, 100, 100, 50);
        
        processKillerInput.setSize(200,200);
        processKillerInput.setVisible(true);

        JFrame frame = new JFrame();
        frame.setTitle("Taskkiller Win64x made by Zinio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(637, 526);
        frame.setVisible(true);
        frame.add(label);
        //frame.add(processKillerInput);
        //frame.add(whitePanel); //Bedeckt im Moment die gesamte Fläche
        

       
        frame.getContentPane().setBackground(Color.BLACK);

        frame.setIconImage(logo.getImage());
    
    }
}
