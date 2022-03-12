package com.company;

public class Main {
  //int minAge = 16;
  //int maxAge = 60;
  //int userAge=29;
  //int dateAge=22;
  //int i;


  public static void main(String[] args) {

    //int input = 95;
    //int minAge=16;
    //int maxAge=60;
    int userAge =9;
    int dateAge = 22;
    System.out.println("Indtast din alder: " + userAge);
    Main obj = new Main();
    int i = obj.minimumAge(userAge);
      if (i>0 ) {
        System.out.printf("Du er for ung til at tage på en date! \nDu skal som minimum være %d år gammel\n", i);
        return;
      }
    int j = obj.maximumAge(userAge);
      if (j > 0) {
        System.out.printf("Du er for gammel til at tage på en date! \nDu er %d år eller ældre og er derfor for gammel til at gå på date\n", j);
        return;
      }
    obj.tooYoung(dateAge, userAge);
      if (true) {
        System.out.println("Din date er for ung til dig, vælg en der er lidt ældre! ");

      }

    obj.tooOld(dateAge, userAge);
      if (true) {
        System.out.println("Din date er for gammel til dig, vælg en der er lidt yngre");
      }


  }

  public int minimumAge(int userAge) {
    int minAge=16;
    int i;
    if (minAge > userAge) {
      return i=minAge;
    }else {
      return i=-1;
    }
  }

  public int maximumAge(int userAge) {
    int maxAge=60;
    int j;
    if (maxAge < userAge) {
      return j=maxAge;
    }else {
      return j = -1;
    }
  }

  public boolean tooYoung(int dateAge, int userAge) {
    int userAgeLowerLimit = ((userAge / 2) + 7);
    if (userAgeLowerLimit > dateAge) {
      return true;
    }
    return false;
  }

  public boolean tooOld(int dateAge, int userAge) {
    int userAgeUpperLimit = ((userAge - 7) * 2);
    if (userAgeUpperLimit < dateAge) {
      return true;
    }
    return false;

  }


}
