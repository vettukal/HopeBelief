package one;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Experiment {
	public static void main(String[] args) {
		for (int k = 1; k < 512; k++) {
			int N = k;//Integer.parseInt(args[0]);
			
			Double[] a = new Double[N];
			for (int i = 0; i < N; i++)
				{
				a[i] = StdRandom.uniform();
				//System.out.println(a[i]);
				}
			System.out.println("-------------------------");
			System.out.println(k);
			MergeSort.sort(a);
			for (int i = 0; i < N; i++);
				//StdOut.println(a[i]);
			//System.out.println(isSorted(a));
		}
		
		
	}
	
	public static boolean isSorted(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}

	private static boolean less(Comparable i, Comparable j) {
		if(i.compareTo(j)<0)
			return true;
		return false;
	}
}