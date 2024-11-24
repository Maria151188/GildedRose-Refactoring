package com.gildedrose;
import java.util.function.Consumer;

class ItemInfo {
    private final ItemType itemType;
    private final SellIn sellIn;

    public ItemInfo(String itemName, int initialSellInDays) {
        this.itemType = new ItemType(itemName);
        this.sellIn = new SellIn(initialSellInDays);
    }

    public boolean isLegendaryItem() {
        return itemType.isLegendaryItem();
    }

    public boolean isAgedBrieItem() {
        return itemType.isAgedBrieItem();
    }

    public boolean isBackstagePassItem() {
        return itemType.isBackstagePassItem();
    }

    public void decrementSellIn() {
        sellIn.decrementDays();
    }

    public void updateItemState(Consumer<SellIn> stateUpdater) {
        stateUpdater.accept(sellIn);
    }

    @Override
    public String toString() {
        return itemType.toString() + ", " + sellIn.toString();
    }
}
