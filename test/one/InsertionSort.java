package one;

public class InsertionSort {

	public static void sort(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j >0 && (less(a[j],a[j-1])); j--) {
				exch(a,j,j-1);
			}
		}
	}
	
	public static boolean less(Comparable here, Comparable there){
		return here.compareTo(there)<0;
	}
	
	public static void exch(Comparable[] a,int i,int j){
		Comparable temp = a[i];
		a[i]  = a[j];
		a[j] = temp;
	}
}
