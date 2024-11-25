package com.gildedrose;

public class GildedRose {
    private final ItemCollection itemCollection;

    public GildedRose(Item[] items) {
        this.itemCollection = new ItemCollection(items);
    }

    public void updateAllItemQualities() {
        itemCollection.updateAllItems();
    }

}

