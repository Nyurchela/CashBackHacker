package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {

    @Test
    public void sholdTestRemainAdd100() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void sholdTestRemainAddZero() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void sholdTestRemainAdd1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}