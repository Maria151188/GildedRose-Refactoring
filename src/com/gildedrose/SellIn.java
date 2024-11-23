package com.gildedrose;

public class SellIn {
    int days;

    public SellIn(int days) {
        this.days = days;
    }

    public void decrement() {
        days--;
    }

    public boolean isNegative() {
        return days < 0;
    }

    @Override
    public String toString() {
        return String.valueOf(days);
    }
}

