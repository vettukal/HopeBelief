package one;

import java.io.File;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.introcs.In;

public class CC_client {
	public static void main(String[] args){
		File file = new File("tinyG.txt");
		In in = new In(file);
		Graph G = new Graph(in);
		ConnectedComponents cc = new ConnectedComponents(G);
		System.out.println(cc.connected(0, 4));
	}

}
