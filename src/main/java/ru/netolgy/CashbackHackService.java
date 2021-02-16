package ru.netolgy;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount % boundary == 0) {
            return 0;
        }
        if (amount > 0 && amount < 10000) {
            return boundary - amount % boundary;
        }

        if (amount > 100000) {
            return 0;
        }
        return 0;
    }
}