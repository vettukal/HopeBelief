
import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import two.LongestPathUnweightedDAG;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.introcs.In;


public class LongPathTest {
	@Test
	public void test() {
		 	// MyClass is tested
			File file = new File("tinyDAG.txt");
			In in = new In(file);
			Digraph G = new Digraph(in);
			
			
			LongestPathUnweightedDAG path = new LongestPathUnweightedDAG(G, 0);
			int len = path.getMaxLength(4);
			
		   // Tests
			assertEquals("dist between 0 and 12 in this file is 4", path.getMaxLength(12), 4);
		    
		   
			
			   
		
		   
		   
	}


}
