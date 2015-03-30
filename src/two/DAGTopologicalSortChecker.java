package two;

import edu.princeton.cs.algs4.Graph;

public class DAGTopologicalSortChecker {

	
	public static void main(String[] args) {

	}
	
	public static boolean isCorrectTopologicalSort(Graph G,int[] order){
		// The approach will be check for each edge v->w, v should come before w in order[].
		// I can think of O(n2) method for it.
		// Take the all the edges from G.adj() method and then check in order[]
		
		// http://cstheory.stackexchange.com/questions/4414/testing-identifying-a-topological-sorting
		// All the edges need to be considered.  Ω(E) is the lowerbound.
		return false;
	}

}
