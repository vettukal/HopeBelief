package one;

import java.io.File;

import edu.princeton.cs.introcs.In;

public class Test {
	public static void main(String[] args){
		File file = new File("tinyG.txt");
		In in = new In(file);
		Graph G = new Graph(in);
		BreadthFirstPaths bfp = new BreadthFirstPaths(G, 0);
		System.out.println(bfp.distTo(9));
	}

}
