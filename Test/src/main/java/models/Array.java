package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Array {
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private Random random = new Random();
	private int summin = 0, summax = 0, total = 0, length =0;
	private ArrayList<Integer> odd = new ArrayList<Integer>();
	private ArrayList<Integer> even = new ArrayList<Integer>();	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public ArrayList<Integer> getOdd() {
		return odd;
	}

	public void setOdd(ArrayList<Integer> odd) {
		this.odd = odd;
	}

	public ArrayList<Integer> getEven() {
		return even;
	}

	public void setEven(ArrayList<Integer> even) {
		this.even = even;
	}

	public ArrayList<Integer> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<Integer> arrayList) {
		this.arrayList = arrayList;
	}
	
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
		summin = total - arrayList.get(0);
		int length = parseInt - 1;
		summax = total - arrayList.get(length);
		System.out.println("Minimum sum: "+summin + " Maximum sum" + summax);
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
		System.out.println("Count total of array: "+parseInt);

	}
	
	public void Odd() {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) % 2 == 1) {
				odd.add(arrayList.get(i));
			}
		}
		System.out.println("odd elements in array: "+odd);

	}

	public void MinMax(int parseInt) {
		System.out.println("Min in array: " + arrayList.get(0));
		System.out.println("Max in array: " + arrayList.get(parseInt - 1));
	}


}
