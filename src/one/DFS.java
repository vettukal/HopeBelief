package one;

public class DFS {
    
    private boolean[] marked;
    private int count;

    public void DFS(Graph G, int s){
	marked = new boolean[G.V()];
	count = 0;
	dfs(G,s);
    }
    
    private void dfs(Graph G,int s){
	marked[s] = true;
	count++;
	
	for(int iter: G.adj(s)){
	    if(marked[iter]==false){
		dfs(G,iter);
	    }
	}
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
