package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        MenuItem myItem = new MenuItem("Food", 5.00, "Something to eat", "Food", new Date("3/20/2024"));
        MenuItem myItem2 = new MenuItem("Pizza", 7.00, "Minsky's", "Food", new Date("4/11/2024"));
        MenuItem myItem3 = new MenuItem("Pizza", 7.00, "Minsky's", "Food", new Date("4/11/2024"));
        menuItems.add(myItem);
        menuItems.add(myItem2);
        menuItems.add(myItem3);

        Menu menu = new Menu(menuItems, "Restaurant", "A good place to eat");
        System.out.println(menu.getLastUpdated());

        menu.removeMenuItem(myItem3);

        menu.printAllMenuItems();

        //boolean sameItem = myItem2.equals(myItem3);
        //System.out.println(sameItem);

    }
}