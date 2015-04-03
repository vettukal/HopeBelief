package two;

/**
 * 
 * @author VINCE
 *The method to find LAC that I can think, is to mark blue for all the ancestors of v, white for all others. Then mark red for all the 
 *ancestors of w which were blue. Then start BFS from v, mark the first vertice. If there are more than one vertice at the
 *same level then do BFS from other matrix. Mark the first matrix found as the answer.
 */
public class LACFinderDAG {

	

enum Color {
	RED,BLUE,WHITE;
}

}

