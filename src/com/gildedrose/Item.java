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

    public void update() {
        if (type.isLegendary()) {
            return;
        }

        sellIn.decrement();

        if (type.isAgedBrie()) {
            updateAgedBrie();
            return;
        }

        if (type.isBackstagePass()) {
            updateBackstagePass();
            return;
        }

        updateRegularItem();
    }

    private void updateAgedBrie() {
        quality.increase();
        if (sellIn.isNegative()) {
            quality.increase();
        }
    }

    private void updateBackstagePass() {
        quality.increase();
        if (sellIn.days < 10) {
            quality.increase();
        }
        if (sellIn.days < 5) {
            quality.increase();
        }
        if (sellIn.isNegative()) {
            quality.reset();
        }
    }

    private void updateRegularItem() {
        quality.decrease();
        if (sellIn.isNegative()) {
            quality.decrease();
        }
    }

    @Override
    public String toString() {
        return type + ", " + sellIn + ", " + quality;
    }
}
