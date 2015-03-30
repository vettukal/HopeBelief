package one;

import edu.princeton.cs.algs4.Graph;

public class Ex_4_1_10 {
    
    private boolean[] marked;
    private int count;

    public int DFS(Graph G, int s){
	marked = new boolean[G.V()];
	count = 0;
	return dfsC(G,s);
    }
    
    private int dfsC(Graph G,int s){
	marked[s] = true;
	count++;
	
	if(checkAdj(G,s)==true) return s;
	for(int iter: G.adj(s)){
	    if(marked[iter]==false){
		return dfsC(G,iter);
	    }
	}
	return -1;
    }

    private boolean checkAdj(Graph G, int v){
	boolean flag = true;
	for(int iter: G.adj(v)){
	    if(marked[iter]==false){
		flag=false;
	    }
	}
	return flag;
    }
	    

    public boolean isMarked(int v){
	return marked[v];
    }

    public int count(){
	return count;
    }

	  
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
