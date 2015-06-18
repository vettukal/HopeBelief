package util;
import java.io.*;
import java.util.*;
public class CustInput{
	public static void main(String[] args){
		
	}

	public static int[] getIntArray() throws Exception{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		String str = "";
		ArrayList<Integer> alist = new ArrayList<Integer>();
		while((str=reader.readLine())!=null){
			if(isNumeric(str))
				alist.add(Integer.parseInt(str));
			else
				break;
		}
		int[] ans = new int[alist.size()];
		int i =0;
		for(Integer iter:alist){
			ans[i++] = iter;
		}
		return ans;
	}

	public static boolean isNumeric(String str){
		return str.matches("-?\\d+(\\.\\d+)?");
	}

}
