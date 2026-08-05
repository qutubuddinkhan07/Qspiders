package com.qsp.array;

import java.util.HashMap;
import java.util.Map;

public class FindFreq {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 1, 9, 2, 6, 4, 8 };
		// findFreqSol(arr);
		findFrec(arr);
	}

	static void findFreqSol(int[] arr) {
		Map<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	static void findFrec(int[] arr) {
		int[] freqArr = new int[10001];
		for (int i = 0; i < arr.length; i++) {
			freqArr[arr[i]]++;
		}
		for (int j = 0; j < freqArr.length; j++) {
			if (freqArr[j] == 0) {
				continue;
			}
			System.out.println(j + " --> " + freqArr[j]);
		}

	}
}
