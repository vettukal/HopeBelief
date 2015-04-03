
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

import two.CommonAncestor;
import two.LongestPathUnweightedDAG;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.introcs.In;


public class CommonAncestorTest {
	@Test
	public void test() {
		 	// MyClass is tested
			File file = new File("tinyDAG.txt");
			In in = new In(file);
			Digraph G = new Digraph(in);
			
			
			CommonAncestor ca = new CommonAncestor();
			Integer[] ances = ca.findCommonAncestor(G, 12, 4);
			System.out.println(Arrays.toString(ances)+"hello");
			
		   // Tests
			assertEquals("dist between 0 and 12 in this file is 4", 0, 0);
		    
		   
			
			   
		
		   
		   
	}


}
