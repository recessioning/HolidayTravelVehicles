import java.util.List;
import java.util.ArrayList;

public class Invoice {
    private String invoiceNumber;
    private String date;
    private double negotiatedPrice;
    private double taxes;
    private double licenseFees;
    private Customer customer;
    private Vehicle vehicle;
    private Salesperson salesperson;
    private TradeInVehicle tradeInVehicle;
    private List<Options> options;
    
    public Invoice() {
        this.options = new ArrayList<>();
    }
    
    public Invoice(String invoiceNumber, String date, double negotiatedPrice, double taxes, double licenseFees) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.negotiatedPrice = negotiatedPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.options = new ArrayList<>();
    }
    
    // Getters and Setters
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public double getNegotiatedPrice() {
        return this.negotiatedPrice;
    }
    
    public double getTaxes() {
        return this.taxes;
    }
    
    public double getLicenseFees() {
        return this.licenseFees;
    }
    
    public Customer getCustomer() {
        return this.customer;
    }
    
    public Vehicle getVehicle() {
        return this.vehicle;
    }
    
    public Salesperson getSalesperson() {
        return this.salesperson;
    }
    
    public TradeInVehicle getTradeInVehicle() {
        return this.tradeInVehicle;
    }
    
    public List<Options> getOptions() {
        return this.options;
    }
}