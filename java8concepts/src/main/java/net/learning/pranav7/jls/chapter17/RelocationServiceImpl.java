package net.learning.pranav7.jls.chapter17;

public class RelocationServiceImpl implements RelocationService {
    private Customer c;
    @Override
    public Customer getCustomer() {
        return c;
    }

    @Override
    public void packageGoods() {
        // TODO Auto-generated method stub

    }

    @Override
    public void shipGoods() {

    }

    @Override
    public void changeAdderss (final Address address){
        try {
        wait();
        getCustomer().setAddress(address);
        }
      catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public void setCustomer(Customer c) {
        this.c = c;
    }
}
