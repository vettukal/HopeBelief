package one;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.introcs.StdIn;

public class StringSorter {
	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		Insertion.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
