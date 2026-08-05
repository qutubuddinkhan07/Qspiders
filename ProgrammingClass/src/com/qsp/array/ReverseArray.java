package com.qsp.array;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    subArrayReverse(arr, 2, 5);
    System.out.println(Arrays.toString(arr));
  }

  static void subArrayReverse(int[] arr, int start, int end) {
    if (start < 0) {
      return;
    }
    if (end >= arr.length) {
      return;
    }
    if (start > end) {
      return;
    }
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
