package menu;

import java.util.*;

import helpers.Regex;
import helpers.Validation;
import models.Algorithm;

public class Showmenu {
	public static void callMenu() {
		Algorithm algorithm = new Algorithm();
		String repeat = null;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do {
			int option = Integer.parseInt(Validation.checkRegex(Regex.NUM, "Choose length data:"));
			if(option >0) {
				algorithm.CreateArray(i);
				algorithm.SumMinMax(i);
				algorithm.MinMax(i);
				algorithm.Even();
				algorithm.Odd();
				algorithm.CountTotal(i);
			}
			System.out.println("Ban co muon tiep tuc khong ? y / n");
			repeat = sc.nextLine();
		} while (repeat.equals("y") == true);

	}
}
