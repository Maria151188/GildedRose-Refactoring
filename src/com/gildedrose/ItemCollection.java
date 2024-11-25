package com.gildedrose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemCollection {
    private final List<Item> items;

    public ItemCollection(Item[] itemsArray) {
        this.items = new ArrayList<>(Arrays.asList(itemsArray));
    }

    public void updateAllItems() {
        items.forEach(Item::updateItemState);
    }
}