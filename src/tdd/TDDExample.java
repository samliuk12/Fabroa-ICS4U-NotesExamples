package tdd;

import java.util.*;

class TDDExample {

  public static int highestNumber(int arr[], int index) {
    if (index == arr.length) {
      return -1;
    }
    return Math.max(arr[index], highestNumber(arr, ++index));
  }

  public static boolean containsNumber(int arr[], int num, int index) {
    if (index == arr.length) {
      return false;
    }
    return arr[index] == num || containsNumber(arr, num, ++index);
  }

}