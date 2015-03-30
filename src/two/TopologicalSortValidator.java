package two;

import edu.princeton.cs.algs4.Graph;

public class TopologicalSortValidator {

	
	public static void main(String[] args) {

	}
	
	public static boolean isValidTopologicalSort(Graph G,int[] order){
		// The approach will be check for each edge v->w, v should come before w in order[].
		// I can think of O(n2) method for it.
		// Take the all the edges from G.adj() method and then check in order[]
		
		// http://cstheory.stackexchange.com/questions/4414/testing-identifying-a-topological-sorting
		// All the edges need to be considered.  Ω(E) is the lowerbound.
		
		boolean ans = true;
		for(int v = 0; v < G.V();v++){
			for(int w : G.adj(v)){
				ans = ans && isLaterinArray(v, w, order);
			}
		}
		return ans;
	}
	
	private static boolean isLaterinArray(int first,int second,int[] array){
		int indexFirst = -1;
		int indexSecond = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==first){
				indexFirst = i;
			}
			if(array[i]==second){
				indexSecond = i;
			}
			if(indexFirst!=-1 && indexSecond!=-1){
				break;
			}
		}
		
		if(indexSecond>indexFirst){
			return true;
		}
		else{
			return false;
		}
	}

}
