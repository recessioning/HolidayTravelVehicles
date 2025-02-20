public class Salesperson {
    private String salespersonID;
    private String name;
    
    public Salesperson() {}
    
    public Salesperson(String salespersonID, String name) {
        this.salespersonID = salespersonID;
        this.name = name;
    }
    
    public String getSalespersonID() {
        return this.salespersonID;
    }
    
    public String getName() {
        return this.name;
    }
}