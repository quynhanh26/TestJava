package menu;

import java.util.*;

import helpers.Regex;
import helpers.Validation;
import models.Array;

public class Showmenu {
	public static void callMenu() {
		Array array = new Array();
		String repeat = null;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Create Array");
			int option = Integer.parseInt(Validation.checkRegex(Regex.NUM, "enter choose"));
			switch (option) {
			case 1:
				i = Integer.parseInt(Validation.checkRegex(Regex.NUM, "enter length:"));
				array.CreateArray(i);
				array.SumMinMax(i);
				array.MinMax(i);
				array.Even();
				array.Odd();
				array.CountTotal(i);
				break;
			}
			System.out.println("Ban co muon tiep tuc khong ? y / n");
			repeat = sc.nextLine();
		} while (repeat.equals("y") == true);

	}
}
