import java.util.*;

public class Order {
    private String orderId;
    private Date orderDate;
    private List<Garment> garments;
    private double totalAmount;

    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.garments = new ArrayList<>();
    }

    public void addGarment(Garment garment) {
        garments.add(garment);
        totalAmount += garment.calculateDiscountPrice(0); // Assuming no discount for now
    }

    public double calculateTotalAmount() {
        totalAmount = 0;
        for (Garment garment : garments) {
            totalAmount += garment.calculateDiscountPrice(0);
        }
        return totalAmount;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Garments:");
        for (Garment garment : garments) {
            System.out.println("- " + garment.getId() + ": " + garment.getName());
        }
        System.out.println("Total Amount: " + totalAmount);
    }

   
    public String getOrderId() { return orderId; }
}

