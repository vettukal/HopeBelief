package one;

import edu.princeton.cs.algs4.Graph;

public class BreadthFirstPaths
{
 private boolean[] marked; // Is a shortest path to this vertex known?
 private int[] edgeTo; // last vertex on known path to this vertex
 private final int s; // source
 private int[] dist;
 public BreadthFirstPaths(Graph G, int s)
 {
 marked = new boolean[G.V()];
 edgeTo = new int[G.V()];
 dist = new int[G.V()];
 dist[s] = 0;
 this.s = s;
 bfs(G, s);
 }
 private void bfs(Graph G, int s)
 {
 Queue<Integer> queue = new Queue<Integer>();
 marked[s] = true; // Mark the source
 queue.enqueue(s); // and put it on the queue.
 while (!queue.isEmpty())
 {
 int v = queue.dequeue(); // Remove next vertex from the queue.
 for (int w : G.adj(v))
 if (!marked[w]) // For every unmarked adjacent vertex,
 {
 edgeTo[w] = v; // save last edge on a shortest path,
 dist[w] = dist[v]+1;
 marked[w] = true; // mark it because path is known,
 queue.enqueue(w);
 }
 }
 }
 
 public int distTo(int w){
	 return dist[w];
 }
 
 
}