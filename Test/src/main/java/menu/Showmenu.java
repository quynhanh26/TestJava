package menu;

import java.util.*;

import helpers.Regex;
import helpers.Validation;
import models.Algorithm;

public class Showmenu {
	public static void callMenu() {
		
		String repeat = null;
		Scanner sc = new Scanner(System.in);
		int option =0;
		do {
			Algorithm algorithm = new Algorithm();
			option = Integer.parseInt(Validation.checkRegex(Regex.NUM, "Choose length data:"));
			if(option > 0) {
				algorithm.CreateArray(option);
				algorithm.SumMinMax();
				algorithm.MinMax();
				algorithm.Even();
				algorithm.Odd();
				algorithm.CountTotal();
			}
			System.out.println("Ban co muon tiep tuc khong ? y / n");
			repeat = sc.nextLine();
		} while (repeat.equals("y") == true);

	}
}
