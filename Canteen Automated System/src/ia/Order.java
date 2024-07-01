package ia;

import java.util.Scanner;

//Define an Order class to hold order details
public class Order {
 private String itemName;
 private double itemPrice;
 private int quantity;

 public Order(String itemName, double itemPrice, int quantity) {
     this.itemName = itemName;
     this.itemPrice = itemPrice;
     this.quantity = quantity;
 }

 public double calculateTotal() {
     return itemPrice * quantity;
 }

 public String getItemName() {
     return itemName;
 }

 public int getQuantity() {
     return quantity;
 }

 // Main method to simulate fast food ordering process
 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
		// Example fast food items
		 String[] menuItems = {"Burger", "Pizza", "Fries"};
		 double[] menuPrices = {5.99, 8.99, 2.49};

		 // Display menu
		 System.out.println("Welcome to Fast Food Order System!");
		 System.out.println("Menu:");
		 for (int i = 0; i < menuItems.length; i++) {
		     System.out.println((i + 1) + ". " + menuItems[i] + " - $" + menuPrices[i]);
		 }

		 // Place an order
		 System.out.print("\nEnter item number to order: ");
		 int choice = scanner.nextInt();
		 if (choice < 1 || choice > menuItems.length) {
		     System.out.println("Invalid choice. Exiting...");
		     return;
		 }

		 System.out.print("Enter quantity: ");
		 int quantity = scanner.nextInt();

		 // Create an Order object based on user's choice
		 Order order = new Order(menuItems[choice - 1], menuPrices[choice - 1], quantity);

		 // Display order summary
		 System.out.println("\nOrder Summary:");
		 System.out.println("Item: " + order.getItemName());
		 System.out.println("Quantity: " + order.getQuantity());
		 System.out.printf("Total: $%.2f\n", order.calculateTotal());

		 // Select payment method
		 System.out.println("\nSelect Payment Method:");
		 System.out.println("1. Credit Card");
		 System.out.println("2. Cash");
		 System.out.print("Enter your choice (1 or 2): ");
		 int paymentMethod = scanner.nextInt();

		 // Process payment based on selected method
		 switch (paymentMethod) {
		     case 1:
		         System.out.println("\nProcessing payment via Credit Card...");
		         // Additional logic for credit card payment
		         break;
		     case 2:
		         System.out.println("\nPlease pay $" + order.calculateTotal() + " in cash.");
		         // Additional logic for cash payment
		         break;
		     default:
		         System.out.println("Invalid choice. Payment cancelled.");
		         break;
		 }
	}

     System.out.println("Thank you for your order! Enjoy your meal!");
 }
}