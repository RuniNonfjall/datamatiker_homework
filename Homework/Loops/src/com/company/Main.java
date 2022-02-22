package com.company;

public class Main {
  public void counter1() {
    for (int counter = 0; counter < 10; counter++) {
      System.out.println("Counter: " + counter);
    }
    System.out.println(" ");
  }

  public void counter2() {
    for (int counter = 1; counter <= 10; counter++) {
      System.out.println("Counter: " + counter);
    }
    System.out.println(" ");
  }


  public void counter3() {
    for (int counter = 0; counter <= 11; counter++) {
      System.out.println("Counter: " + counter);
    }
    System.out.println(" ");
  }

  public void counter4() {
    for (int counter = 10; counter >= 0; counter--) {
      System.out.println("Counter: " + counter);
    }
    System.out.println("Liftoff!");
    System.out.println(" ");
  }
  public void counter5() {
    for (int counter = 1; counter < 20; counter+=2) {
      System.out.println("Counter: " + counter);
    }
    System.out.println(" ");
  }

  public void counter6() {
    int counter =0;
        for (int i = 1; i <= 16777216; i*=2) {
      System.out.println("Counter: " + i);
      counter++;
    }
    System.out.println(counter);

    }


  public static void main(String[] args) {
    Main obj = new Main();

    obj.counter1();
    obj.counter2();
    obj.counter3();
    obj.counter4();
    obj.counter5();
    obj.counter6();



  }
}

/*

    int counter;
    for(counter=10; counter > 0; counter--) {
      System.out.println("Counter: " + counter);

    }
    System.out.println("Counter: " + counter);




 //public int counter =0;



    public void countdown() {
      if (counter > 0) {
        counter--;
        System.out.println("Count: " + counter);
        countdown();





while (counter>0) {
          counter--;
          System.out.println(counter);
        }

              do {
        counter--;
        System.out.println("Counter: " + counter);
      } while (counter > 0);
    }

  //Main obj= new Main();
  //obj.countdown();


 */
