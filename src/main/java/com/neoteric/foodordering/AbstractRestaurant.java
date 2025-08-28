package com.neoteric.foodordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class AbstractRestaurant {
    protected String name;
    protected List<Menu> menu = new ArrayList<>();

    public AbstractRestaurant(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addMenuItem(Menu item) {
        for (Menu m : menu) {
            if (m.getItemName().equalsIgnoreCase(item.getItemName())) {
                throw new IllegalArgumentException("Duplicate menu item: " + item.getItemName());
            }
        }
        menu.add(item);
    }

    public void removeMenuItem(String itemName) {
        Menu toRemove = null;
        for (Menu item : menu) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                toRemove = item;
                break;
            }
        }
        if (toRemove == null) {
            throw new MenuItemNotFoundException(itemName);
        }
        menu.remove(toRemove);
        System.out.println("Removed menu item: " + itemName + " from " + name);
    }

    public List<Menu> getMenu() {
        return Collections.unmodifiableList(menu);
    }

    public abstract void showMenu();
}