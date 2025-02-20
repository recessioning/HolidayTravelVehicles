public class Options {
    private String optionCode;
    private String description;
    private double price;
    
    public Options() {}
    
    public Options(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
    
    public String getOptionCode() {
        return this.optionCode;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public double getPrice() {
        return this.price; 
    }
}

