package ia;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    private JTextField txtLogin;
    private JTextField txtRegister;
    private JButton btnNewButton;
    private JLabel lblNewLabel_3;

    // Define valid username and password
    private static final String VALID_USERNAME = "cafe";
    private static final String VALID_PASSWORD = "000000";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
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
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 180, 629, 356);
        contentPane = new JPanel();
        contentPane.setForeground(new Color(230, 230, 250));
        contentPane.setBackground(new Color(173, 216, 230));
        contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(0, 0, 0, 0);
        contentPane.add(passwordField);
        
        textField = new JTextField();
        textField.setBounds(0, 0, 0, 0);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JTextPane textPane = new JTextPane();
        textPane.setBounds(186, 112, 227, 32);
        contentPane.add(textPane);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(186, 186, 227, 32);
        passwordField_1.setBackground(new Color(255, 255, 255));
        contentPane.add(passwordField_1);
        
        JLabel lblNewLabel = new JLabel("CANTEEN LOGIN");
        lblNewLabel.setBounds(217, 48, 169, 42);
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(0, 0, 255));
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(lblNewLabel);
        
        txtLogin = new JTextField();
        txtLogin.setBounds(186, 253, 78, 21);
        txtLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String username = textPane.getText().trim();
                String password = new String(passwordField_1.getPassword());
                
                if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                    dispose(); // Close the login window
                    Homepage homepage = new Homepage();
                    homepage.setVisible(true);
                } else if (!username.equals(VALID_USERNAME) && !password.equals(VALID_PASSWORD)) {
                    // Invalid username and password
                    JOptionPane.showMessageDialog(null, "Invalid username and password", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!username.equals(VALID_USERNAME)) {
                    // Invalid username
                    JOptionPane.showMessageDialog(null, "Invalid username", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Invalid password
                    JOptionPane.showMessageDialog(null, "Invalid password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }           
        });
        txtLogin.setToolTipText("");
        txtLogin.setForeground(new Color(245, 255, 250));
        txtLogin.setBackground(new Color(0, 0, 205));
        txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txtLogin.setText("      login");
        contentPane.add(txtLogin);
        
        txtRegister = new JTextField();
        txtRegister.setBounds(329, 253, 86, 21);
        txtRegister.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                Registration registration = new Registration();
                registration.setVisible(true);
            }
        });
        txtRegister.setForeground(Color.WHITE);
        txtRegister.setBackground(new Color(0, 0, 205));
        txtRegister.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txtRegister.setText("    Register");
        contentPane.add(txtRegister);
        txtRegister.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("username");
        lblNewLabel_1.setBounds(112, 123, 64, 21);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("password");
        lblNewLabel_2.setBounds(112, 195, 64, 23);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        contentPane.add(lblNewLabel_2);
        
        btnNewButton = new JButton("X");
        btnNewButton.setBounds(574, 0, 55, 21);
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setForeground(new Color(255, 255, 255));
        contentPane.add(btnNewButton);
        
        lblNewLabel_3 = new JLabel("Forgot username / password ?");
        lblNewLabel_3.setBounds(217, 306, 177, 14);
        lblNewLabel_3.setForeground(new Color(148, 0, 211));
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                Email email = new Email();
                email.setVisible(true);
            }
        });
        contentPane.add(lblNewLabel_3);
        
        setUndecorated(true);
    }

    /**
     * Validate login credentials.
     * 
     * @param username
     * @param password
     * @return true if username and password are valid, false otherwise
     */
    public boolean validateLogin(String username, String password) {
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}
