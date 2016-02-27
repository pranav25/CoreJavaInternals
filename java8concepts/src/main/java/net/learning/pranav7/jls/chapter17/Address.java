package net.learning.pranav7.jls.chapter17;

public class Address {

    private String city;
    private String houseAddress;
    private String pinCode;
    public Address(String city, String houseAddress, String pinCode) {
        super();
        this.city = city;
        this.houseAddress = houseAddress;
        this.pinCode = pinCode;
    }
    public String getCity() {
        return city;
    }
    public String getHouseAddress() {
        return houseAddress;
    }
    public String getPinCode() {
        return pinCode;
    }

    
}
