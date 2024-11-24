package com.gildedrose;

public class SellIn {
    private int remainingDays; // Перейменовано для більшої зрозумілості

    public SellIn(int initialDays) {
        this.remainingDays = initialDays;
    }

    public void decrementDays() { // Перейменовано для чіткого опису дії
        remainingDays--;
    }

    public boolean hasExpired() { // Більш зрозуміле ім'я методу
        return remainingDays < 0;
    }

    public boolean isLessThanThreshold(int threshold) { // Описує дію точніше
        return remainingDays < threshold;
    }

    @Override
    public String toString() {
        return String.valueOf(remainingDays);
    }
}


