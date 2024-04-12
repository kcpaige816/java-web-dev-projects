package org.launchcode;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private String name;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category, Date dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name = name;
        this.dateAdded = dateAdded;

        isNew = isItemNew();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() { return dateAdded; }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                ", name='" + name + '\'' +
                ", dateAdded=" + dateAdded +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(price, menuItem.price) == 0 && Objects.equals(description, menuItem.description) && Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, name);
    }

    private static int dayDifferenceBetweenTwoDates(Date d1, Date d2) {
        int dayDifference = (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
        return dayDifference;
    }

    private boolean isItemNew() {
        int difference = dayDifferenceBetweenTwoDates(new Date(), dateAdded);
        return difference >= -30;
    }
}