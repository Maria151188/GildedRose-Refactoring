package com.gildedrose;

public class ItemType {
    private final String name;

    public ItemType(String name) {
        this.name = name;
    }

    public boolean isLegendary() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    public boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }

    public boolean isBackstagePass() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    @Override
    public String toString() {
        return name;
    }
}

