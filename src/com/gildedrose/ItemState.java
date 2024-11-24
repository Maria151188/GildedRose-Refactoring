package com.gildedrose;

class ItemState {
    private final Quality itemQuality;

    public ItemState(int initialQuality) {
        this.itemQuality = new Quality(initialQuality);
    }

    public void updateAgedBrieItem(SellIn sellInDays) {
        itemQuality.increaseQuality();
        if (sellInDays.hasExpired()) {
            itemQuality.increaseQuality();
        }
    }

    public void updateBackstagePassItem(SellIn sellInDays) {
        itemQuality.increaseQuality();
        if (sellInDays.isLessThanThreshold(10)) {
            itemQuality.increaseQuality();
        }
        if (sellInDays.isLessThanThreshold(5)) {
            itemQuality.increaseQuality();
        }
        if (sellInDays.hasExpired()) {
            itemQuality.resetQuality();
        }
    }

    public void updateRegularItem(SellIn sellInDays) {
        itemQuality.decreaseQuality();
        if (sellInDays.hasExpired()) {
            itemQuality.decreaseQuality();
        }
    }

    @Override
    public String toString() {
        return itemQuality.toString();
    }
}
