package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (isLegendary(item)) {
                continue; // Legendary items are not updated
            }

            updateSellIn(item);

            if (isAgedBrie(item)) {
                updateAgedBrie(item);
                continue;
            }

            if (isBackstagePass(item)) {
                updateBackstagePasses(item);
                continue;
            }

            updateRegularItem(item);
        }
    }

    private boolean isLegendary(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private void updateSellIn(Item item) {
        item.sellIn--;
    }


    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }

    private void updateBackstagePasses(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }

        if (item.sellIn < 10 && item.quality < 50) {
            item.quality++;
        }

        if (item.sellIn < 5 && item.quality < 50) {
            item.quality++;
        }

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void updateRegularItem(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}
