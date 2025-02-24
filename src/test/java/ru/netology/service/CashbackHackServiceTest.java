package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void amountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void amountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void amountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void amountMultipleToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}