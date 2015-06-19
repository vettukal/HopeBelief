package one;

import java.util.Arrays;

public class MergeSort {
	
	static int count = 0;
	public static void sort(Comparable[] a){
		Comparable[] aux = new Comparable[a.length];
		sort(a,aux,0,a.length-1);
		System.out.println(count);
	}	

	public static void sort(Comparable[] a,Comparable[] aux,int low, int hi){
		for (int i = low; i <= hi; i++) {
		//	System.out.print(a[i]+" ");
		}
		//System.out.println();
		if(low>=hi) return;
		int mid = low + (hi - low)/2;
		sort(a,aux,low,mid);
		sort(a,aux,mid+1,hi);
		if(less(a[mid],a[mid+1])) return;
		merge(a,aux,low,mid,hi);
		
		for (int i = low; i <= hi; i++) {
		//	System.out.print(a[i]+" ");
		}
		//System.out.println();
	}

	public static void merge(Comparable[] a,Comparable[] aux,int lo, int mid, int hi){
		for(int i=0;i<a.length;i++)
			{aux[i]= a[i]; count += 2;}

		int i = lo;
		int j = mid+1;

		for(int k=lo;k<=hi;k++){
			if(i>mid)           {a[k] = aux[j++]; count += 2;}
			else if(j>hi)            {a[k] = aux[i++];count += 2;}
			else if(less(aux[j],aux[i])) {a[k] = aux[j++];count += 2;}
			else                {a[k] = aux[i++];count += 2;}
		}
		//a = aux;
	}

	public static boolean less(Comparable here, Comparable there){
		return here.compareTo(there)<0;
	}
	
	public static void main(String[] args) {
		Integer[] iarr = new Integer[7];
		iarr[0] = 0;
		iarr[1] = 1;
		iarr[2] = 8;
		iarr[3] = 9;
		
		iarr[4] = 3;
		iarr[5] = 4;
		iarr[6] = 5;
		
		Integer[] aux = new Integer[7];
		System.out.println(Arrays.toString(iarr));
		merge(iarr, aux, 0, 3, 6);
		System.out.println(Arrays.toString(iarr));
	}
}
