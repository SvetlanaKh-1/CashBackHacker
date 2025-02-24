package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void amountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void amountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void amountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void amountMultipleToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}