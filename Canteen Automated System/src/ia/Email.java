package ia;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Email extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Email frame = new Email();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Email() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 200, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(119, 136, 153));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Account Recovery");
        lblNewLabel.setBounds(141, 0, 177, 38);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("X");
        btnNewButton.setBounds(393, 0, 57, 23);
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setForeground(new Color(255, 255, 255));
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Get code");
        btnNewButton_1.setBounds(339, 63, 89, 23);
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                generateCode();
            }
        });
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(100, 149, 237));
        contentPane.add(btnNewButton_1);

        JLabel lblNewLabel_1 = new JLabel("Enter E-mail");
        lblNewLabel_1.setBounds(51, 63, 89, 14);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(165, 63, 163, 23);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblEnterCode = new JLabel("Enter code");
        lblEnterCode.setBounds(51, 118, 89, 14);
        lblEnterCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblEnterCode.setForeground(new Color(255, 255, 255));
        contentPane.add(lblEnterCode);

        textField_1 = new JTextField();
        textField_1.setBounds(165, 115, 163, 23);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(165, 163, 163, 23);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(165, 217, 163, 23);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Reset username");
        lblNewLabel_2.setBounds(51, 166, 89, 14);
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Reset password");
        lblNewLabel_3.setBounds(51, 220, 89, 14);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        contentPane.add(lblNewLabel_3);

        JButton btnNewButton_2 = new JButton("Reset");
        btnNewButton_2.setBounds(198, 266, 89, 23);
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose(); // Close the current frame
                openLoginModule(); // Open the login module
            }
        });
        btnNewButton_2.setBackground(new Color(75, 0, 130));
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(btnNewButton_2);

        setUndecorated(true);
    }

    public void generateCode() {
        String email = textField.getText().trim();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid email. Please enter an email address.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!email.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(this, "Invalid email format. Only @gmail.com addresses are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
          
            Random random = new Random();
            int code = random.nextInt(700000 - 275140 + 1) + 275140;
            textField_1.setText(String.valueOf(code));
        }
    }

    private void openLoginModule() {
        // Assuming you have a separate Login class or frame, instantiate and display it
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    
	}

}
