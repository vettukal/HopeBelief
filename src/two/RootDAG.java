package two;

import java.util.LinkedList;

import edu.princeton.cs.algs4.Graph;

public class RootDAG {
	/**
	 * 
	 * @param G=the graph for which you have to find roots. 
	 * @return array of roots.
	 * NOTE: There can be more than one roots in a DAG
	 * 
	 * See: http://cs.stackexchange.com/questions/9133/finding-a-source-of-a-directed-acyclic-graph-in-linear-time
	 */
	public static int[] getDigraphRoot(Graph G){
		boolean[] check = new boolean[G.V()];
		for(int v=0;v<G.V();v++){
			for (int w : G.adj(v)) {
				check[w] = true;
			}
		}
		
		int counter =0;
		for (int i = 0; i < check.length; i++) {
			if(check[i]==false){
				++counter;
			}
		}
		int[] ans= new int[counter];
		counter = 0;
		for (int i = 0; i < check.length; i++) {
			if(!check[i]){
				ans[counter++] = i;
			}
		}
		return ans;
	}

}
