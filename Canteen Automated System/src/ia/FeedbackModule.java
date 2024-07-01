package ia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class FeedbackModule extends JFrame {

    private JLabel lblOrderId, lblFeedback, lblRating;
    public static JTextField txtOrderId;
    public static  JTextArea txtFeedback;
    public static JComboBox<String> cbRating;
    public static JButton btnSubmit;

    public FeedbackModule() {
        setTitle("Feedback Module");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblOrderId = new JLabel("Order ID:");
        lblOrderId.setBounds(20, 20, 100, 25);
        add(lblOrderId);

        txtOrderId = new JTextField();
        txtOrderId.setBounds(150, 20, 200, 25);
        add(txtOrderId);

        lblFeedback = new JLabel("Feedback:");
        lblFeedback.setBounds(20, 60, 100, 25);
        add(lblFeedback);

        txtFeedback = new JTextArea();
        txtFeedback.setBounds(150, 60, 200, 100);
        add(txtFeedback);

        lblRating = new JLabel("Rating:");
        lblRating.setBounds(20, 180, 100, 25);
        add(lblRating);

        String[] ratings = { "1", "2", "3", "4", "5" };
        cbRating = new JComboBox<>(ratings);
        cbRating.setBounds(150, 180, 200, 25);
        add(cbRating);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(150, 220, 100, 25);
        add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOrderId.getText();
                txtFeedback.getText();
                cbRating.getSelectedItem();

                // Logic to store feedback into the database can be added here

                JOptionPane.showMessageDialog(null, "Thank you for your feedback!");
                clearFields();
            }
        });
    }

    public static void clearFields() {
        txtOrderId.setText("");
        txtFeedback.setText("");
        cbRating.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        FeedbackModule feedbackModule = new FeedbackModule();
        feedbackModule.setVisible(true);
    }

	public static void getTxtOrderId() {
		// TODO Auto-generated method stub
		
	}

	public static void getTxtFeedback() {

		// TODO Auto-generated method stub
		
	}

	public void getCbRating() {
		
		// TODO Auto-generated method stub
		
	}
	
}