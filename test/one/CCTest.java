package one;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

import Util.Rnd;
import edu.princeton.cs.algs4.CC;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.introcs.In;

public class CCTest {

	@Test
	public void test() {
		 	// MyClass is tested
			File file = new File("tinyG.txt");
			In in = new In(file);
			Graph G = new Graph(in);
		   ConnectedComponents tester = new ConnectedComponents(G);
		   CC libtest = new CC(G);

		   // Tests
		   for (int i = 0; i < 10; i++) {
			   int v = Rnd.r(13);
			   int w = Rnd.r(13);
			   System.out.println(libtest.connected(v, w)+"--"+ tester.connected(v,w));
			   assertEquals("0 and 4 should be connected", libtest.connected(v, w), tester.connected(v,w));
		}
		   
		   
	}

}
