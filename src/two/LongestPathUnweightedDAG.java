package two;

import java.util.Arrays;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Stack;

/**
 * 
 * @author VINCE
 *This class takes a Unweighted DAG and a source. It has a method which returns the greatest distance 
 *between source and that vertex.  
 */
public class LongestPathUnweightedDAG {
	private Digraph G;
	private int source;
	private int[] dist;
	private Stack<Integer> stack;
	private boolean[] marked;
	
	public LongestPathUnweightedDAG(Digraph G,int source){
		this.G = G;
		this.source = source;
		dist = new int[G.V()];
		for (int i = 0; i < dist.length; i++) {
			dist[i] = Integer.MIN_VALUE;
		}
		marked = new boolean[G.V()];
		stack = new Stack<Integer>();
		calculateDist();
	}
	
	public int getMaxLength(int w){
		return dist[w];
	}
	
	private void calculateDist(){
		int[] order = getTopSortOrder();
		dist[source] = 0;
		for(int oiter:order){
			for(int w:G.adj(oiter)){
				dist[w] = Math.max(dist[oiter]+1, dist[w]);
			}
		}
		
	}

	private int[] getTopSortOrder() {
		dfs(G,source);
		int[] order = new int[stack.size()];
		int i =0;
		while(!stack.isEmpty()){
			order[i++] = stack.pop();
		}
		return order;
	}
	
	private void dfs(Digraph G, int s){
		marked[s] = true;
		for(int w:G.adj(s)){
			if(!marked[w]){
				dfs(G,w);
			}
		}
		stack.push(s);
	}
	
	
}
