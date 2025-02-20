public class TradeInVehicle {
    private String serialNumber;
    private String make;
    private String model;
    private int year;
    
    public TradeInVehicle() {}
    
    public TradeInVehicle(String serialNumber, String make, String model, int year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getSerialNumber() {
        return this.serialNumber;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public int getYear() {
        return this.year;
    }
}