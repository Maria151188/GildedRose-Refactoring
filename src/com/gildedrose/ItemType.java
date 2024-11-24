package com.gildedrose;

public class ItemType {
    private final String name;

    public ItemType(String name) {
        this.name = name;
    }
    public boolean isLegendaryItem() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }
    public boolean isAgedBrieItem() {
        return name.equals("Aged Brie");
    }
    public boolean isBackstagePassItem() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
    @Override
    public String toString() {
        return name;
    }
}