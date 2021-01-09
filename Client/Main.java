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
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

        var logo = new ImageIcon(".//Java//Client//res//logo.jpg", "-");

        ImageIcon image = new ImageIcon(".//Java//Client//res//logo.jpg", "-");

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(59, 325, 500, 62);
        whitePanel.setOpaque(true);
        whitePanel.setVisible(true);
        
        JLabel label = new JLabel();
        label.setLocation(27, 75);
        label.setSize(500, 150);
        label.setForeground(Color.white);
        label.setBackground(Color.BLACK);
        label.setIconTextGap(100);
        label.setBorder(border);
        label.setIcon(image);
        label.setOpaque(true);
        label.setVisible(true);

        JLabel label2 = new JLabel();
        label.setText("Taskkiller");
        label.setLocation(0, 0);
        label.setFont(new Font("Arial Black",Font.PLAIN,20));
        label.setForeground(Color.white);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setVisible(true);

        JButton processKillerInput = new JButton();
        processKillerInput.setBounds(390, 341, 65, 30);
        processKillerInput.setSize(65,30);
        processKillerInput.setBackground(new Color(0xE1E1E1));
        processKillerInput.setVisible(true);
        processKillerInput.setText("Kill");

        JButton loopKillerInput = new JButton();
        loopKillerInput.setBounds(476, 341, 65, 30);
        loopKillerInput.setSize(65, 30);
        loopKillerInput.setVisible(true);
        loopKillerInput.setBackground(new Color(0xE1E1E1));
        loopKillerInput.setText("Loop");
        loopKillerInput.setOpaque(true);

        JFrame frame = new JFrame();
        frame.setTitle("Taskkiller Win64x made by Zinio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.add(label);
        frame.add(label2);
        frame.add(processKillerInput);
        frame.add(loopKillerInput);
        frame.add(whitePanel);
        frame.setSize(637, 526);
        frame.setVisible(true);
        
        
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setIconImage(logo.getImage());
    }
}
