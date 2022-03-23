package main;

import java.util.Scanner;

import main.draw.Cucc;
import main.mines.Flield;
import main.reader.Vals;
import main.reader.UsersPlace;

public class Run {

	public static void main(String[] args) {
		UsersPlace userbullsht = new UsersPlace(new Scanner(System.in));
		Vals vals = userbullsht.ussr1();
		int numberOfMines = userbullsht.ratatacount(vals.getHouseSize());
		Flield mainthing= new Flield(vals.val1, vals.otherval, numberOfMines);
		Cucc cuccing = new Cucc();
		cuccing.doYourThing(mainthing);
		userbullsht.finishHim();
	}

}
