package com.gildedrose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemCollection {
    private final List<Item> items;

    public ItemCollection(Item[] itemsArray) {
        this.items = new ArrayList<>();
        this.items.addAll(Arrays.asList(itemsArray));
    }

    public void updateItems() {
        for (Item item : items) {
            item.update();
        }
    }

    public List<Item> getItems() {
        return items;
    }
}
