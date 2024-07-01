package ia;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Homepage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel menuLabel;
    private JComboBox<String> fastFoodComboBox;
    private JComboBox<String> iceCreamComboBox;
    private JComboBox<String> juiceComboBox;
    private JComboBox<String> beverageComboBox;
    private JComboBox<String> riceComboBox;
    private JComboBox<String> curryComboBox; // New combo box for Curry
	/**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Homepage frame = new Homepage();
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
    public Homepage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 100, 768, 576);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 105, 180));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        
        setContentPane(contentPane);
        contentPane.setLayout(null);
        menuLabel = new JLabel("MENU");
        menuLabel.setBounds(368, 11, 63, 25);
        menuLabel.setForeground(new Color(255, 255, 255));
        menuLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        contentPane.add(menuLabel);
        
        JButton btnNewButton_1 = new JButton(" X");
        btnNewButton_1.setBounds(714, 0, 54, 23);
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        btnNewButton_1.setBackground(Color.RED);
        btnNewButton_1.setForeground(Color.WHITE);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel_1 = new JLabel("MENU");
        lblNewLabel_1.setBounds(368, 11, 63, 25);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        contentPane.add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("Customized menu");
        btnNewButton.setBounds(319, 340, 161, 33);
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 139, 139));
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show input dialog for customized menu details
                String details = JOptionPane.showInputDialog(Homepage.this,
                        "Write your customized menu details here:");
                
                // Check if the user canceled or entered empty details
                if (details == null) {
                    return; // User canceled the input dialog
                }
                
                details = details.trim(); // Trim to handle empty spaces
                
                // Check if details are empty after trimming
                if (details.isEmpty()) {
                    JOptionPane.showMessageDialog(Homepage.this,
                            "Please fill the field.",
                            "Empty Field",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Handle the details entered (e.g., save to file, process, etc.)
                JOptionPane.showMessageDialog(Homepage.this,
                        "Customized menu details:\n" + details,
                        "Customized Menu Details",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        contentPane.add(btnNewButton);
        
        JButton btnNewButton_2 = new JButton("Beverages");
        btnNewButton_2.setBounds(104, 205, 135, 33);
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setBackground(new Color(218, 165, 32));
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                beverageComboBox.setVisible(!beverageComboBox.isVisible());
            }
        });
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Fast Food");
        btnNewButton_3.setBounds(104, 92, 135, 33);
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setBackground(new Color(255, 0, 255));
        btnNewButton_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fastFoodComboBox.setVisible(!fastFoodComboBox.isVisible());
            }
        });
        contentPane.add(btnNewButton_3);
        
        fastFoodComboBox = new JComboBox<>();
        fastFoodComboBox.setBounds(104, 140, 135, 23);
        fastFoodComboBox.addItem("Pizza");
        fastFoodComboBox.addItem("Burger");
        fastFoodComboBox.addItem("Shawarma");
        fastFoodComboBox.addItem("Sandwich");
        fastFoodComboBox.addItem("French Fries");
        fastFoodComboBox.addItem("Samosa");
        fastFoodComboBox.addItem("Spring Roll");
        fastFoodComboBox.setVisible(false);
        contentPane.add(fastFoodComboBox);
        
        JButton btnNewButton_4 = new JButton("Ice cream");
        btnNewButton_4.setBounds(326, 92, 135, 33);
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setBackground(new Color(123, 104, 238));
        btnNewButton_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                iceCreamComboBox.setVisible(!iceCreamComboBox.isVisible());
            }
        });
        contentPane.add(btnNewButton_4);
        
        iceCreamComboBox = new JComboBox<>();
        iceCreamComboBox.setBounds(326, 140, 135, 23);
        iceCreamComboBox.addItem("Mango");
        iceCreamComboBox.addItem("Vanilla");
        iceCreamComboBox.addItem("Chocolate");
        iceCreamComboBox.addItem("Strawberry");
        iceCreamComboBox.addItem("Blue Berry");
        iceCreamComboBox.addItem("Kulfa");
        iceCreamComboBox.addItem("Pista");
        iceCreamComboBox.setVisible(false);
        contentPane.add(iceCreamComboBox);
        
        JButton btnNewButton_5 = new JButton("Rice");
        btnNewButton_5.setBounds(326, 205, 134, 33);
        btnNewButton_5.setForeground(new Color(255, 255, 255));
        btnNewButton_5.setBackground(new Color(255, 160, 122));
        btnNewButton_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                riceComboBox.setVisible(!riceComboBox.isVisible());
            }
        });
        contentPane.add(btnNewButton_5);
        
        JButton btnNewButton_7 = new JButton("Juices");
        btnNewButton_7.setBounds(547, 90, 125, 36);
        btnNewButton_7.setForeground(new Color(255, 255, 255));
        btnNewButton_7.setBackground(new Color(144, 238, 144));
        btnNewButton_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                juiceComboBox.setVisible(!juiceComboBox.isVisible());
            }
        });
        contentPane.add(btnNewButton_7);
        
        juiceComboBox = new JComboBox<>();
        juiceComboBox.setBounds(547, 140, 125, 23);
        juiceComboBox.addItem("Apple Juice");
        juiceComboBox.addItem("Mango Juice");
        juiceComboBox.addItem("Pineapple Juice");
        juiceComboBox.addItem("Fruit Punch");
        juiceComboBox.addItem("Mango Shake");
        juiceComboBox.addItem("Banana Shake");
        juiceComboBox.addItem("Caramel Shake");
        juiceComboBox.addItem("Strawberry Shake");
        juiceComboBox.setVisible(false);
        contentPane.add(juiceComboBox);

        // New Beverage ComboBox
        beverageComboBox = new JComboBox<>();
        beverageComboBox.setBounds(104, 254, 135, 23);
        beverageComboBox.addItem("Coke");
        beverageComboBox.addItem("Sprite");
        beverageComboBox.addItem("Fanta");
        beverageComboBox.addItem("Lemon Malt");
        beverageComboBox.addItem("Peach Malt");
        beverageComboBox.addItem("Orange Malt");
        beverageComboBox.addItem("Mango Malt");
        beverageComboBox.addItem("Apple Malt");
        beverageComboBox.addItem("Tea");
        beverageComboBox.addItem("Coffee");
        beverageComboBox.setVisible(false);
        contentPane.add(beverageComboBox);

        // New Rice ComboBox
        riceComboBox = new JComboBox<>();
        riceComboBox.setBounds(311, 254, 150, 23);
        riceComboBox.addItem("Chicken Biryani");
        riceComboBox.addItem("Beef Biryani");
        riceComboBox.addItem("Mutton Biryani");
        riceComboBox.addItem("Chicken Pulao");
        riceComboBox.addItem("Beef Pulao");
        riceComboBox.addItem("Mutton Pulao");
        riceComboBox.addItem("Black Pepper Rice");
        riceComboBox.addItem("Egg Fried Rice");
        riceComboBox.setVisible(false);
        contentPane.add(riceComboBox);

        // New Curry ComboBox
        curryComboBox = new JComboBox<>();
        curryComboBox.setBounds(524, 254, 150, 23);
        curryComboBox.addItem("Chicken Curry");
        curryComboBox.addItem("Beef Curry");
        curryComboBox.addItem("Mutton Curry");
        curryComboBox.addItem("Chicken Nihari");
        curryComboBox.addItem("Beef Nihari");
        curryComboBox.addItem("Mutton Nihari");
        curryComboBox.addItem("Chicken Haleem");
        curryComboBox.addItem("Beef Haleem");
        curryComboBox.addItem("Mutton Haleem");
        curryComboBox.addItem("Mix Sabzi");
        curryComboBox.addItem("Aloo Gosht");
        curryComboBox.addItem("Aloo Qeema");
        curryComboBox.addItem("Aloo Matar");
        curryComboBox.addItem("Curry Pakora");
        curryComboBox.addItem("Dahi Bhallay");
        curryComboBox.addItem("Chana Chaat");
        curryComboBox.addItem("Raita");
        curryComboBox.addItem("Salad");
        curryComboBox.addItem("Roti");
        curryComboBox.addItem("Naan");
        curryComboBox.setVisible(false);
        contentPane.add(curryComboBox);

        JButton btnNewButton_8 = new JButton("Curry");
        btnNewButton_8.setBounds(537, 205, 135, 33);
        btnNewButton_8.setForeground(new Color(255, 255, 255));
        btnNewButton_8.setBackground(new Color(188, 143, 143));
        btnNewButton_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                curryComboBox.setVisible(!curryComboBox.isVisible());
            }
        });
        contentPane.add(btnNewButton_8);
        
        JButton btnProfile = new JButton("Profile");
        btnProfile.setBounds(0, 35, 76, 23);
        btnProfile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	// Show additional buttons for Account, Order, and Logout
                JButton btnAccount = new JButton("Account");
                btnAccount.setBounds(0, 60, 100, 30);
                btnAccount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Handle Account button click
                        JOptionPane.showMessageDialog(Homepage.this, "View Account Details");
                    }
                });
                contentPane.add(btnAccount);
                
                JButton btnOrder = new JButton("Order");
                btnOrder.setBounds(0, 100, 100, 30);
                btnOrder.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Handle Order button click
                        JOptionPane.showMessageDialog(Homepage.this, "View Orders");
                    }
                });
                contentPane.add(btnOrder);
                
                JButton btnLogout = new JButton("Logout");
                btnLogout.setBounds(0, 140, 100, 30);
                btnLogout.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Handle Logout button click
                        int choice = JOptionPane.showConfirmDialog(Homepage.this, 
                                "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            // Perform logout actions here
                            dispose();  // Close the window or perform logout logic
                        }
                    }
                });
                contentPane.add(btnLogout);
                
                // Refresh the content pane to show the new buttons
                contentPane.revalidate();
                contentPane.repaint();
            }
        });
        btnProfile.setBackground(new Color(255, 222, 173));
        btnProfile.setForeground(new Color(255, 255, 255));
        contentPane.add(btnProfile);
        
        contentPane.add(btnNewButton_7);
        
        JLabel lblNewLabel = new JLabel("About us");
        lblNewLabel.setBounds(368, 493, 63, 14);
        lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Display information about key personnel
                String aboutMessage = "CEO: Muhammad Rohaan Khan\n"
                                    + "Director: Ahsan Pervaiz Ilyaz (Brooker)\n"
                                    + "Producer: Shaheer Bin Shahbaz\n"
                                    + "Engineer: Ahsan Afzaal";
                
                JOptionPane.showMessageDialog(Homepage.this,
                        aboutMessage,
                        "About Us",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        lblNewLabel.setForeground(new Color(0, 0, 205));
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("Need Help?");
        lblNewLabel_2.setBounds(368, 531, 72, 14);
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showHelpOptions();
            }
        });
        lblNewLabel_2.setForeground(new Color(0, 0, 205));
        contentPane.add(lblNewLabel_2);
        
        JButton btnNewButton_6 = new JButton("Checkout");
        btnNewButton_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StringBuilder checkoutMessage = new StringBuilder("Items added to checkout:\n");

                // Check if any items are selected
                boolean itemsSelected = false;

                // Append selected items from each category
                if (fastFoodComboBox.isVisible() && fastFoodComboBox.getSelectedItem() != null) {
                    checkoutMessage.append("Fast Food: ").append(fastFoodComboBox.getSelectedItem()).append("\n");
                    itemsSelected = true;
                }
                if (iceCreamComboBox.isVisible() && iceCreamComboBox.getSelectedItem() != null) {
                    checkoutMessage.append("Ice Cream: ").append(iceCreamComboBox.getSelectedItem()).append("\n");
                    itemsSelected = true;
                }
                if (juiceComboBox.isVisible() && juiceComboBox.getSelectedItem() != null) {
                    checkoutMessage.append("Juice: ").append(juiceComboBox.getSelectedItem()).append("\n");
                    itemsSelected = true;
                }
                if (beverageComboBox.isVisible() && beverageComboBox.getSelectedItem() != null) {
                    checkoutMessage.append("Beverage: ").append(beverageComboBox.getSelectedItem()).append("\n");
                    itemsSelected = true;
                }
                if (riceComboBox.isVisible() && riceComboBox.getSelectedItem() != null) {
                    checkoutMessage.append("Rice: ").append(riceComboBox.getSelectedItem()).append("\n");
                    itemsSelected = true;
                }
                if (curryComboBox.isVisible() && curryComboBox.getSelectedItem() != null) {
                    checkoutMessage.append("Curry: ").append(curryComboBox.getSelectedItem()).append("\n");
                    itemsSelected = true;
                }

                // If no items are selected, show a message
                if (!itemsSelected) {
                    JOptionPane.showMessageDialog(Homepage.this,
                            "Select items to order.",
                            "No Items Selected",
                            JOptionPane.WARNING_MESSAGE);
                    return; // Exit the method
                }

                // Show checkout confirmation dialog
                int option = JOptionPane.showConfirmDialog(Homepage.this,
                        checkoutMessage.toString() + "\n\nProceed to Confirm?",
                        "Checkout Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (option == JOptionPane.YES_OPTION) {
                    // Proceed with confirmation logic (e.g., finalize order, etc.)
                    JOptionPane.showMessageDialog(Homepage.this,
                            "Order confirmed!",
                            "Confirmation",
                            JOptionPane.INFORMATION_MESSAGE);
                    // Additional logic for confirming the order can be added here
                }
            }
        });

        btnNewButton_6.setForeground(new Color(255, 255, 255));
        btnNewButton_6.setBackground(new Color(210, 105, 30));
        btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnNewButton_6.setBounds(679, 35, 89, 23);
        contentPane.add(btnNewButton_6);



        setUndecorated(true);
    }

    private void showHelpOptions() {
        // Array of questions
        String[] questions = {
                "How to order?",
                "How to give review?",
                "How to write address?",
                "How to log out?"
        };

        // Array of answers corresponding to questions
        String[] answers = {
                "To order, please select items from the menu and proceed to checkout.",
                "To give a review, navigate to the 'Review' section and follow the instructions.",
                "To write an address, go to your profile settings and update your address information.",
                "To log out, click on the 'Logout' button in the profile section."
        };

        // Show dropdown list of questions
        String selectedQuestion = (String) JOptionPane.showInputDialog(this,
                "Select a question:", "Need Help",
                JOptionPane.PLAIN_MESSAGE, null,
                questions, questions[0]);

        // Find index of selected question
        int index = -1;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].equals(selectedQuestion)) {
                index = i;
                break;
            }
        }

        // Show corresponding answer
        if (index != -1) {
            JOptionPane.showMessageDialog(this,
                    answers[index], "Help - " + questions[index],
                    JOptionPane.INFORMATION_MESSAGE);
        }
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Homepage frame = new Homepage();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
    }

    public JLabel getMenuLabel() {
        return menuLabel;
    }
}
