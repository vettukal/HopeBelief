package one;

public class Client {
    public static void main(String[] args){
	Graph g = new Graph(5);
	g.addEdge(1,2);
	g.addEdge(1,4);
	g.addEdge(4,2);
	g.addEdge(2,3);

	DFS d = new DFS();
	Ex_4_1_10 e = new Ex_4_1_10();
	int ans = e.DFS(g,1);
	d.DFS(g,1);
	
	System.out.println("Ans = "+ans);
	System.out.println(d.isMarked(0));
	System.out.println(d.isMarked(3));

	System.out.println(d.count());
    }
}
