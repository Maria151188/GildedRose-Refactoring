package com.gildedrose;
public class Item {
    public ItemType itemType; // Перейменовано для точності
    public SellIn sellInDays; // Перейменовано для більшої зрозумілості
    public Quality itemQuality; // Перейменовано для узгодженості
    public Item name;

    public Item(String itemName, int initialSellInDays, int initialQuality) {
        this.itemType = new ItemType(itemName);
        this.sellInDays = new SellIn(initialSellInDays);
        this.itemQuality = new Quality(initialQuality);
    }
    public void updateItemState() { // Перейменовано для чіткого опису
        if (itemType.isLegendaryItem()) {
            return;
        }
        sellInDays.decrementDays();
        if (itemType.isAgedBrieItem()) {
            updateAgedBrieItem();
            return;
        }
        if (itemType.isBackstagePassItem()) {
            updateBackstagePassItem();
            return;
        }
        updateRegularItem();
    }
    private void updateAgedBrieItem() { // Додано описове ім'я
        itemQuality.increaseQuality();
        if (sellInDays.hasExpired()) {
            itemQuality.increaseQuality();
        }
    }
    private void updateBackstagePassItem() { // Додано описове ім'я
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
    private void updateRegularItem() { // Додано описове ім'я
        itemQuality.decreaseQuality();
        if (sellInDays.hasExpired()) {
            itemQuality.decreaseQuality();
        }
    }
    @Override
    public String toString() {
        return itemType + ", " + sellInDays + ", " + itemQuality;
    }
}
