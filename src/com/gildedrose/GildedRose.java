package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.type.isLegendary()) {
                continue; // Legendary items are not updated
            }

            item.sellIn.decrement();

            if (item.type.isAgedBrie()) {
                updateAgedBrie(item);
                continue;
            }

            if (item.type.isBackstagePass()) {
                updateBackstagePasses(item);
                continue;
            }

            updateRegularItem(item);
        }
    }

    private void updateAgedBrie(Item item) {
        item.quality.increase();

        if (item.sellIn.isNegative()) {
            item.quality.increase();
        }
    }

    private void updateBackstagePasses(Item item) {
        item.quality.increase();

        if (item.sellIn.days < 10) {
            item.quality.increase();
        }

        if (item.sellIn.days < 5) {
            item.quality.increase();
        }

        if (item.sellIn.isNegative()) {
            item.quality.reset();
        }
    }

    private void updateRegularItem(Item item) {
        item.quality.decrease();

        if (item.sellIn.isNegative()) {
            item.quality.decrease();
        }
    }
}
