package com.gildedrose;
public class Item {
    private final ItemInfo itemInfo;
    private final ItemState itemState;

    public Item(String itemName, int initialSellInDays, int initialQuality) {
        this.itemInfo = new ItemInfo(itemName, initialSellInDays);
        this.itemState = new ItemState(initialQuality);
    }

    public void updateItemState() {
        if (itemInfo.isLegendaryItem()) {
            return;
        }
        itemInfo.decrementSellIn();
        if (itemInfo.isAgedBrieItem()) {
            updateAgedBrie();
            return;
        }
        if (itemInfo.isBackstagePassItem()) {
            updateBackstagePass();
            return;
        }
        updateRegularItem();
    }
    private void updateAgedBrie() {
        itemInfo.updateItemState(itemState::updateAgedBrieItem);
    }
    private void updateBackstagePass() {
        itemInfo.updateItemState(itemState::updateBackstagePassItem);
    }
    private void updateRegularItem() {
        itemInfo.updateItemState(itemState::updateRegularItem);
    }
    @Override
    public String toString() {
        return itemInfo.toString() + ", " + itemState.toString();
    }
}