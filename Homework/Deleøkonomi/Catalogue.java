package circular;

import java.util.ArrayList;

public class Catalogue {
  //For at lave en item liste vi kan ændre i laver vi en arraylist
  private final ArrayList<Item> items = new ArrayList<>();
  private int size;

  //Husker størrelsen på catalogue
  public Catalogue(int size) {
    this.size = size;
  }

  //tilføjer et nyt item til item listen
  public void addItem(Item item) {
    if (items.stream().count() >= this.size)
      return;

    items.add(item);
  }

  public Item findItem(String description) {
    for (Item item : items) {
      if (description.equalsIgnoreCase(item.getDescription())) {
        return item;
      }
    }
    return null;
  }

  public void borrowItem(Item item) {
    item.setAvailable(false);
  }

  public void returnItem(Item item) {
    item.setAvailable(true);
  }

  public ArrayList<Item> getFullList() {
    return items;
  }

  public ArrayList<Item> getAvailableItems() {
    ArrayList<Item> availableItems = new ArrayList<>();
    for (Item item : items) {
      if (item.getAvailable()) {
        availableItems.add(item);
      }
    }
    return availableItems;
  }
}
