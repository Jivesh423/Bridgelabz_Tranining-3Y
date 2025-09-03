// 3. The Online Shopping Cart 
// A shopping app stores product prices in an array when a customer adds items.
// Use a loop to calculate the total cart value.
// Apply a discount of 10% if the total exceeds 5000.
// Add a delivery charge of 100 if the total after discount is less than 2000.
// Display the final payable amount.


public class OnlineShoppingCart {
    public static void main(String[] args) {
        double[] productPrices = {1500.0, 2500.0, 1200.0, 800.0};
        double totalCartValue = 0.0;

        for (double price : productPrices) {
            totalCartValue += price;
        }

        double finalAmount = totalCartValue;

        if (finalAmount > 5000) {
            finalAmount = finalAmount * 0.90;
        }

        if (finalAmount < 2000) {
            finalAmount = finalAmount + 100;
        }

        System.out.println("The final payable amount is: " + finalAmount);
    }
}
