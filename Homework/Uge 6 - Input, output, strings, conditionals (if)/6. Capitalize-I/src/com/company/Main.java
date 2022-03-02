package com.company;

public class Main {

  public static void main(String[] args) {
    Main obj = new Main();
    obj.Capitalize("REGIN");
    obj.Capitalize("regin");
    obj.Capitalize("ReGin");
    obj.Capitalize("rEGiN");
    obj.Capitalize("reGin");
    obj.Capitalize("reGIN");
    obj.Capitalize("ReGIn");
  }
  public void Capitalize(String name) {
    String nameCap = name.substring(0, 1);
    nameCap = nameCap.toUpperCase();

    String nameLow = name.substring(1);
    nameLow = nameLow.toLowerCase();

    System.out.println(nameCap + nameLow);
  }
}
