package com.gildedrose;

public class SellIn {
    private int days; // Поле стало приватним для інкапсуляції

    public SellIn(int days) {
        this.days = days;
    }

    public void decrement() {
        days--;
    }

    public boolean isNegative() {
        return days < 0;
    }

    public boolean isLessThan(int threshold) {
        return days < threshold; // Перевірка "менше ніж"
    }

    @Override
    public String toString() {
        return String.valueOf(days);
    }
}

