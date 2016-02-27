package net.learning.pranav7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.junit.Assert;
import net.learning.pranav7.jls.chapter17.Address;
import net.learning.pranav7.jls.chapter17.Person;
import net.learning.pranav7.jls.chapter17.RelocationService;
import net.learning.pranav7.jls.chapter17.RelocationServiceImpl;

import org.junit.Before;
import org.junit.Test;

public class TestThreadExceptions {

    RelocationService relocationService;
    Person p;
    Address oldAddress, newAddress, recentAddress;
    ExecutorService executorService;
    Future<?> future1, future2;
    Runnable task1, task2;

    @Before
    public void setUpData() {
        p = new Person(1, "Pranav");
        oldAddress = new Address("Kuhil Basahan", " Sirmaur", "173001");
        newAddress = new Address("WashingtonDC", "North Street ", "IG1 3BJ");
        recentAddress = new Address("London", "EAST Street ", "P34 IKT");
        relocationService = new RelocationServiceImpl();
        p.setAddress(oldAddress);
        relocationService.setCustomer(p);
    }

    @Test(expected = IllegalMonitorStateException.class)
    public void givenUnsynchronizedMethod_WithWait_thenRaiseIllegalMonitorState() throws Exception {
        relocationService.changeAdderss(recentAddress);
       // Assert.assertEquals("Address equal", "London", relocationService.getCustomer().getAddress().getCity());
    }
}
