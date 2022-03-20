package circular;

public class Item {
  private String category;
  private String description;
  private Boolean available;

  public Item(String category, String description) {
    this.category = category;
    this.description = description;
    this.available = true;
  }


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
    }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getAvailable() {
    return this.available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  @Override
  public String toString() {
    return "Item{" +
        "category='" + category + '\'' +
        ", description='" + description + '\'' +
        ", available=" + available +
        '}';
  }
}

