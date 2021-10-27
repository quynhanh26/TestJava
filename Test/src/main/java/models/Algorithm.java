package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Algorithm {
	 ArrayList<Integer> arrayList = new ArrayList<Integer>();
	 Random random = new Random();
	 int summin = 0, summax = 0, total = 0;
	 ArrayList<Integer> odd = new ArrayList<Integer>();
	 ArrayList<Integer> even = new ArrayList<Integer>();	
	
	public void CreateArray(int parseInt) {
		try {
			for(int i =0; i< parseInt ;i++) {
				int a = random.nextInt(99) + 1;
				arrayList.add(a);
				total += a;
			}
			System.out.println("Array: " + arrayList);
		} catch (Exception e) {
			System.out.println("no data");
		}
		
	}
	
	public void SumMinMax(int parseInt) {
		Collections.sort(arrayList);
		summax = total - arrayList.get(0);
		int length = parseInt - 1;
		summin = total - arrayList.get(length);
		System.out.println("Minimum sum: "+summin + " Maximum sum: " + summax);
	}

	public void Even() {
		try {
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i) % 2 == 0) {
					even.add(arrayList.get(i));
				}
			}
			System.out.println("Even elements in array: "+even);
		} catch (Exception e) {
			System.out.println("no data");

		}
	}

	
	public void CountTotal(int parseInt) {
		System.out.println("Count total of array: "+arrayList.size());

	}
	
	public void Odd() {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) % 2 != 0) {
				odd.add(arrayList.get(i));
			}
		}
		System.out.println("Odd elements in array: "+ odd);

	}

	public void MinMax(int parseInt) {
		Collections.sort(arrayList);
		System.out.println("Min in array: " + arrayList.get(0));
		int length = parseInt - 1;
		System.out.println("Max in array: " + arrayList.get(length));
	}


}
