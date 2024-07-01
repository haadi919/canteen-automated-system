package ia;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class Registration extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JButton btnNewButton_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration frame = new Registration();
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
    public Registration() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 150, 395, 450);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(221, 160, 221));
        contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Registration Form");
        lblNewLabel.setBounds(118, 30, 166, 40);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Enter Full Name");
        lblNewLabel_1.setBounds(31, 100, 86, 14);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Enter username");
        lblNewLabel_2.setBounds(31, 176, 102, 14);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setBounds(150, 97, 206, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(150, 133, 206, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("E-mail");
        lblNewLabel_3.setBounds(31, 135, 86, 14);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_3);

        textField_3 = new JTextField();
        textField_3.setBounds(150, 174, 206, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Enter password");
        lblNewLabel_4.setBounds(31, 219, 86, 14);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Re-enter password");
        lblNewLabel_5.setBounds(31, 256, 120, 14);
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_5);

        textField_4 = new JTextField();
        textField_4.setBounds(150, 217, 206, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setBounds(150, 256, 206, 20);
        contentPane.add(textField_5);
        textField_5.setColumns(10);

        JButton btnNewButton = new JButton("Confirm");
        btnNewButton.setBounds(128, 316, 144, 28);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the Registration window
                Login login = new Login();
                login.setVisible(true); // Open the Login window
            }
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(100, 149, 237));
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("X");
        btnNewButton_1.setBounds(335, 0, 60, 23);
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        btnNewButton_1.setBackground(new Color(255, 0, 0));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        contentPane.add(btnNewButton_1);

        setUndecorated(true);
 
	}

	public void testRegistration() {
	
	}
}
