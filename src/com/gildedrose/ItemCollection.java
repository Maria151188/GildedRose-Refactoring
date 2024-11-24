package com.gildedrose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemCollection {
    private final List<Item> itemList; // Перейменовано для описовості

    public ItemCollection(Item[] itemsArray) {
        this.itemList = new ArrayList<>();
        this.itemList.addAll(Arrays.asList(itemsArray));
    }

    public void updateAllItems() { // Більш точна назва
        for (Item item : itemList) {
            item.updateItemState();
        }
    }

    public List<Item> getAllItems() { // Чіткіша назва методу
        return itemList;
    }
}
