package de.maxrichter.parallelization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleStream {
  public static void main(String[] args) {
    List<Integer> numbers = createNumbers();
    System.out.println("Count < 10: " + numbers.stream().filter(n -> n < 10).count());
  }

  public static List<Integer> createNumbers() {
    List<Integer> intList = new ArrayList<Integer>();
    Random rand = new Random();

    int max = 20;
    int min = 0;

    for (int i = 0; i < 100; i++) {
      int randomNum = rand.nextInt((max - min) + 1) + min;
      System.out.println(randomNum);
      intList.add(randomNum);
    }
    return intList;
  }
}
