package com.gildedrose;

public class GildedRose {
    private final ItemCollection itemCollection;

    public GildedRose(Item[] items) {
        this.itemCollection = new ItemCollection(items);
    }

    public void updateAllItemQualities() { // Перейменовано для точності
        itemCollection.updateAllItems();
    }

    public Item[] getAllItemsAsArray() { // Більш зрозуміла назва
        return itemCollection.getAllItems().toArray(new Item[0]);
    }
}




