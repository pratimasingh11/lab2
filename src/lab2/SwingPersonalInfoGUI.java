package lab2;

import javax.swing.*;
import java.awt.*;

public class SwingPersonalInfoGUI extends JFrame {

    public SwingPersonalInfoGUI() {
        // Set up the frame
        setTitle("Personal Information Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");

        // Create text fields
        JTextField nameTextField = new JTextField(20);
        JTextField emailTextField = new JTextField(20);

        // Create panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.add(nameLabel);
        inputPanel.add(nameTextField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailTextField);

        // Create and set the image icon
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures.png");
        JLabel imageLabel = new JLabel(imageIcon);

        // Add components to the frame
        add(imageLabel, BorderLayout.WEST);
        add(inputPanel, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingPersonalInfoGUI();
            }
        });
    }
}
