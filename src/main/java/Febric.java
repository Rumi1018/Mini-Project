
public class Febric {
    
    private String id;
    private String type;
    private String color;
    private double pricePerMeter;

    public Fabric(String id, String type, String color, double pricePerMeter) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.pricePerMeter = pricePerMeter;
    }

    public double calculateCost(double meters) {
        return pricePerMeter * meters;
    }

   
    public String getId() { return id; }
}

