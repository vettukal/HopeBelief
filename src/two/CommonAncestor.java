package two;

import java.util.LinkedList;

import edu.princeton.cs.algs4.Digraph;

public class CommonAncestor {
	public Integer[] findCommonAncestor(Digraph G, int v,int w ){
		G = G.reverse();
		Color[] painted = new Color[G.V()];
		for(int i=0;i<G.V();i++){
			painted[i] = Color.WHITE;
		}
		firstDFS(G,v,new boolean[G.V()],painted);
		secondDFS(G,w,new boolean[G.V()],painted);
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < painted.length; i++) {
			if(painted[i] == Color.RED){
				list.add(i);
			}
		}
		
		return ((Integer[]) list.toArray());
	}
	
	private void secondDFS(Digraph G, int s, boolean[] marked,Color[] painted) {
		marked[s] = true;
		if(painted[s] == Color.BLUE){
			painted[s] = Color.RED;
		}
		for(int w: G.adj(s)){
			if(!marked[w]){
				secondDFS(G, w, marked, painted);
			}
		}
		
	}

	private void firstDFS(Digraph G, int s, boolean[] marked,Color[] painted) {
		marked[s] = true;
		painted[s] = Color.BLUE;
		for(int w:G.adj(s)){
			if(!marked[w]){
				firstDFS(G, w, marked, painted);
			}
		}
	}

	enum Color {
		WHITE,BLUE,RED;
	}

}
