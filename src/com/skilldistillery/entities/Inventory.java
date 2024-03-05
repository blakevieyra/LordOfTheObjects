package com.skilldistillery.entities;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    protected Map<Item, Integer> items;
    
    public Inventory() {
    	items = new HashMap<>();
    }

    // add item to inventory
    public void addItem(Item item) {
        
        if (items.containsKey(item)) {
        	items.put(item, items.get(item) + 1);

        } else {
        	items.put(item, 1);
        }
    }

    // remove item from inventory
    public void useItem(Item item) {
    	if (items.get(item) > 0) {
    		items.put(item, items.get(item) - 1);
    	} else {
    		System.out.println("You do not have an " + item);
    	}
    }
    
    public Integer getItemCount(Item item) {
    	return items.get(item);
    }

    // Get all items in inventory
    public Map<Item, Integer> getItems() {
        return new HashMap<>(items);
    }
}