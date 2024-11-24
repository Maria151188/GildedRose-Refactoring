package com.gildedrose;

public class SellIn {
    private int remainingDays;

    public SellIn(int initialDays) {
        this.remainingDays = initialDays;
    }
    public void decrementDays() {
        remainingDays--;
    }
    public boolean hasExpired() {
        return remainingDays < 0;
    }
    public boolean isLessThanThreshold(int threshold) {
        return remainingDays < threshold;
    }
    @Override
    public String toString() {
        return String.valueOf(remainingDays);
    }
}