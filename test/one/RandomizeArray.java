package one;

import java.util.Random;

public class RandomizeArray<T> {

	private T t;
	public T[] randomize(T[] t){
		Random r = new Random();
				
		for (int i = 0; i < t.length; i++) {
			int pos = r.nextInt(i+1);
			T swap = t[pos];
			t[pos] = t[i];
			t[i] = swap;
		}
		return t;
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		Integer[] intar = new Integer[10];
		for (int i = 0; i < intar.length; i++) {
			intar[i] = r.nextInt(40);
			System.out.print(intar[i]+" ");
		}
		System.out.println("");
		System.out.println("--------------------");
		RandomizeArray<Integer> ra = new RandomizeArray<Integer>();
		ra.randomize(intar);
		
		for (int i = 0; i < intar.length; i++) {
			//intar[i] = r.nextInt(40);
			System.out.print(intar[i]+" ");
		}
	}
}
