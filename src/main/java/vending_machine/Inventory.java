package vending_machine;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Objects;

public class Inventory {
    private final String id;
    private final Deque<Item> inventory = new ArrayDeque<>();
    private String label;
    private float price;

    public Inventory(String id, String label, float price) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }

        this.id = id;
        this.label = label;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void addItem(Item item) {
        throw new UnsupportedOperationException();
    }

    public void removeItem() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory1 = (Inventory) o;
        return inventory1.price == price &&
                id.equals(inventory1.id) &&
                Arrays.equals(inventory.toArray(), inventory1.inventory.toArray()) &&
                Objects.equals(label, inventory1.label);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
