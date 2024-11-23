package com.gildedrose;

public class Item {
    public ItemType type;
    public SellIn sellIn;
    public Quality quality;
    public Item name;

    public Item(String name, int sellIn, int quality) {
        this.type = new ItemType(name);
        this.sellIn = new SellIn(sellIn);
        this.quality = new Quality(quality);
    }

    @Override
    public String toString() {
        return type + ", " + sellIn + ", " + quality;
    }
}

