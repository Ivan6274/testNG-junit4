package ru.netolgy;

import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class BonusServiceTest {

    @Test
    public void testCalculateBonusMin() {
        BonusService service = new BonusService();
        int actual = service.calculateBonus(900);


        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void testCalculateBonusMiddle() {
        BonusService service = new BonusService();
        int actual = service.calculateBonus(5900);


        int expected = 49;
        assertEquals(actual, expected);

    }

    @Test
    public void testCalculateBonusMax() {
        BonusService service = new BonusService();
        int actual = service.calculateBonus(24900);


        int expected = 100;
        assertEquals(actual, expected);

    }

}