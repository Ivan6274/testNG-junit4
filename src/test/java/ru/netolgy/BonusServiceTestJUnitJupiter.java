package ru.netolgy;



import static org.junit.Assert.assertEquals;


class BonusServiceTestJUnitJupiter {
    @org.junit.jupiter.api.Test
    public void testCalculateBonusMin() {
        BonusService service = new BonusService();
        int actual = service.calculateBonus(900);


        int expected = 0;
        assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void testCalculateBonusMiddle() {
        BonusService service = new BonusService();
        int actual = service.calculateBonus(5900);


        int expected = 49;
        assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void testCalculateBonusMax() {
        BonusService service = new BonusService();
        int actual = service.calculateBonus(24900);


        int expected = 100;
        assertEquals(actual, expected);

    }

}

