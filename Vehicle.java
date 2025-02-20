public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;
    
    public Vehicle() {}
    
    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }
    
    public String getSerialNumber() {
        return this.serialNumber;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getManufacturer() {
        return this.manufacturer;
    }
    
    public double getBaseCost() {
        return this.baseCost;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "serialNumber='" + this.serialNumber + '\'' +
                ", name='" + this.name + '\'' +
                ", model='" + this.model + '\'' +
                ", year=" + this.year +
                ", manufacturer='" + this.manufacturer + '\'' +
                ", baseCost=" + this.baseCost +
                '}';
    }
}