package net.learning.pranav7.jls.chapter17;

public class Person implements Customer{
    int  id ;
    String name;
    Address address;
    
    @Override
    public Address getAddress() {
        return address;
    }
    @Override
    public void setAddress(Address address) {
        this.address = address;
    }
    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}