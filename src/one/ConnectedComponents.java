package one;

import edu.princeton.cs.algs4.Graph;

public class ConnectedComponents {
	/**
	 * Going to add the marked[] and component[] array. And we also need 
	 * a count variable. 
	 * @param G
	 */
	private int[] component;
	private boolean[] marked;
	private int count;
	private Graph G;
	public ConnectedComponents(Graph G){
		this.G = G;
		count = 0;
		component = new int[this.G.V()];
		marked = new boolean[this.G.V()];
		for(int i=0;i<G.V();i++){
			if(marked[i]==false){
				dfs(G,i);
				count++;
			}
		}
	}
	
	private void dfs(Graph G, int s) {
		component[s]=count;
		marked[s] = true;
		for(int v:G.adj(s)){
			if(marked[v]==false){
				dfs(G,v);
			}
		}
	}

	public boolean connected(int v,int w){
		return component[v]==component[w];
	}
	
	public int count(){
		return count;
	}
	
	public int id(int v){
		return component[v];
	}
	
	
	

}
