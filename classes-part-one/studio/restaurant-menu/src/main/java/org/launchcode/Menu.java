package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;
    private String restaurantName;
    private String restaurantDescription;

    public Menu(ArrayList<MenuItem> menuItems, String restaurantName, String restaurantDescription) {
        this.menuItems = menuItems;
        this.restaurantName = restaurantName;
        this.restaurantDescription = restaurantDescription;

        updateLatestDateFromMenuItems();
    }

    public void addMenuItem(MenuItem newItem) {
        menuItems.add(newItem);

        updateLatestDateFromMenuItems();
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void printAllMenuItems() {
        for (MenuItem menuItem : menuItems) {
            printSingleMenuItem(menuItem);
        }
    }

    public void printSingleMenuItem(MenuItem menuItem) {
        System.out.println("Name: " + menuItem.getName());
        System.out.println("Cost: " + menuItem.getPrice());
        System.out.println("Description: " + menuItem.getDescription());
        System.out.println("Category: " + menuItem.getCategory());
        System.out.println("New Item: " + menuItem.isNew());
        System.out.println();
    }

    private void updateLatestDateFromMenuItems() {
        Date latestDate = new Date("1/1/1900");
        for (MenuItem menuItem : menuItems) {

            if (menuItem.getDateAdded().after(latestDate)) {
                latestDate = menuItem.getDateAdded();
            }
        }
        lastUpdated = latestDate;
    }
}