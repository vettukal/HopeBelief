package Util;
import java.util.Random;


public class Rnd {
	
	public static int r(int a,int b){
		Random rand = new Random();
		return rand.nextInt(a)+b;
	}
	
	public static int r(int a){
		return r(a,0);
	}

}
