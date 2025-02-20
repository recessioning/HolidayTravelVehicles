public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer() {}
    
    public Customer(String customerID, String name, String address, String phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber; 
    }

    public String getCustomerID() {
        return this.customerID;
    }
        
    public String getName() {
        return this.name;
    }
        
    public String getAddress() {
        return this.address;
    }
        
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
