package com.gildedrose;

public class GildedRose {
    private final ItemCollection itemCollection;

    public GildedRose(Item[] items) {
        this.itemCollection = new ItemCollection(items);
    }

    public void updateQuality() {
        itemCollection.updateItems();
    }

    public Item[] getItems() {
        return itemCollection.getItems().toArray(new Item[0]);
    }
}



