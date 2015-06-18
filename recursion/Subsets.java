import java.util.ArrayList;


public class Subsets{
	public static void main(String[] args){
		System.out.println("Hello world");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		ArrayList<ArrayList<Integer>> list = subsets(al);
		for (ArrayList<Integer> iter : list) {
			System.out.println(iter.toString());
		}
	}

	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> set){

		if(set.size()==0){
			ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> nulli = new ArrayList<Integer>();
			ans.add(nulli);
			return ans;
		}
			

		Integer fe = set.get(0);
		set = set.remove(0);

		ArrayList<ArrayList<Integer>> ret = subsets(set);

		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
//		if(ret==null){
//			ArrayList<Integer> al = new ArrayList<Integer>();
//			al.add(fe);
//			ans.add(al);
//		}
//		
//		else
		
		{
			for(ArrayList<Integer> iter: ret){
				ans = ans.add(iter);
				ans = ans.add(iter.add(fe));
			}
		}
		
		return ans;
	}

}
