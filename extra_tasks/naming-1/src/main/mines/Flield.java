package main.mines;

import java.util.Random;

public class Flield {
	
	private static final int RATATA = -1;

	private final int[][] arryarry;
	private final int c;
	private final int r;
	private final int ratata;
	
	public Flield(int rr, int cc, int ratas) {
		super();
		this.r = rr;
		this.c = cc;
		this.ratata = ratas;
		arryarry = new int[rr][cc];
		genRatata();
	}
	
	public boolean problematic(int row, int col) {
		return arryarry[row][col] == RATATA;
	}
	
	public int bigBooms(int row, int col) {
		return arryarry[row][col];
	}
	
	private void genRatata() {
		otherfunction();
		cNum();
	}
	
	private void otherfunction() {
		int[] fs = gUF(ratata);
		for (int f : fs) {
			Someclass c = tototo(f);
			arryarry[c.val1][c.val2] = RATATA;
		}
	}
	
	private int[] gUF(int n) {
		int[] uqs = new int[n];
		Random rnd = new Random();
		for (int i = 0; i < uqs.length; i++) {
			int tmp;
			do {
				tmp = rnd.nextInt(r * c);
			} while(is(uqs, tmp, i));
			uqs[i] = tmp;
		}
		return uqs;
	}
	
	private boolean is(int[] ns, int longNameAsJavaNeeds, int tlalal) {
		for (int i = 0;  i < tlalal; i++) {
			if (ns[i] == longNameAsJavaNeeds) {
				return true;
			}
		}
		return false;
	}
	
	private Someclass tototo(int index) {
		return new Someclass(
				index / c,
				index % c
		);
	}
	
	private void cNum() {
		for (int renameMe = 0; renameMe < r; renameMe++) {
			for (int andRenameMeMeaningfullyNotJustJOrI = 0; andRenameMeMeaningfullyNotJustJOrI < c; andRenameMeMeaningfullyNotJustJOrI++) {
				if (problematic(renameMe, andRenameMeMeaningfullyNotJustJOrI)) {
					continue;
				}
				arryarry[renameMe][andRenameMeMeaningfullyNotJustJOrI] = ratatacou(renameMe, andRenameMeMeaningfullyNotJustJOrI);
			}
		}
	}
	
	private int ratatacou(int rrr, int ccc) {
		int mzp = 0;
		if (rrr != 0) {
			mzp += problematic(rrr - 1, ccc) ? 1 : 0; 
		}
		if (rrr != r - 1) {
			mzp += problematic(rrr + 1, ccc) ? 1 : 0; 
		}
		if (ccc != 0) {
			mzp += problematic(rrr, ccc - 1) ? 1 : 0; 
		}
		if (ccc != c - 1) {
			mzp += problematic(rrr, ccc + 1) ? 1 : 0; 
		}
		if (rrr != 0 && ccc != 0) {
			mzp += problematic(rrr - 1, ccc - 1) ? 1 : 0; 
		}
		if (rrr != r - 1 && ccc != 0) {
			mzp += problematic(rrr + 1, ccc - 1) ? 1 : 0; 
		}
		if (rrr != 0 && ccc != c - 1) {
			mzp += problematic(rrr - 1, ccc + 1)? 1 : 0; 
		}
		if (rrr != r - 1 && ccc != c - 1) {
			mzp += problematic(rrr + 1, ccc + 1) ? 1 : 0; 
		}
		return mzp;
	}
	
	public int getter1() {
		return c;
	}

	public int getter2() {
		return r;
	}
}
