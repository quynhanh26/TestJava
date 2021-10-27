package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Algorithm {
	ArrayList<Integer> arrayList;
	int total = 0;

	public void CreateArray(int parseInt) {
		arrayList = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < parseInt; i++) {
			int a = random.nextInt(99) + 1;
			arrayList.add(a);
			total += a;
		}
		System.out.println("Array: " + arrayList);

	}

	public void SumMinMax() {
		int summin = 0, summax = 0;
		Collections.sort(arrayList);
		if (arrayList.size() == 1) {
			summax = arrayList.get(0);
			summin = arrayList.get(0);
		} else {
			summax = total - arrayList.get(0);
			int length = arrayList.size() - 1;
			summin = total - arrayList.get(length);
		}

		System.out.println("Minimum sum and Maximum sum : " + summin + " , " + summax);
	}

	public void Even() {
		ArrayList<Integer> even = new ArrayList<Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) % 2 == 0) {
				even.add(arrayList.get(i));
			}
		}
		System.out.println("Even elements in array: " + even);
	}

	public void CountTotal() {
		System.out.println("Count total of array: " + arrayList.size());
	}

	public void Odd() {
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) % 2 != 0) {
				odd.add(arrayList.get(i));
			}
		}
		System.out.println("Odd elements in array: " + odd);
	}

	public void MinMax() {
		Collections.sort(arrayList);
		System.out.println("Min in array: " + arrayList.get(0));
		int length = arrayList.size() - 1;
		System.out.println("Max in array: " + arrayList.get(length));
	}

}
