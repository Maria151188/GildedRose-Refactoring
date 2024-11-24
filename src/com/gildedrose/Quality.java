package com.gildedrose;
public class Quality {
    private int value;

    public Quality(int value) {
        this.value = value;
    }
    public void increaseQuality() {
        if (value < 50) {
            value++;
        }
    }
    public void decreaseQuality() {
        if (value > 0) {
            value--;
        }
    }
    public void resetQuality() {
        value = 0;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}