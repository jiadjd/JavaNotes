package AdjacencyMatrix;

public class Main {

	public static void main(String[] args) {
		/*
		 * adjacency matrix is a 2D (n*n) array representing edges
		 * run time complexity to check an edge O(1)
		 * space complexity is O(v^2)
		 */
		
		Graph g = new Graph(5);
		g.addNode(new Node('A'));
		g.addNode(new Node('B'));
		g.addNode(new Node('C'));
		g.addNode(new Node('D'));
		g.addNode(new Node('E'));
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		
		g.print();
		
		System.out.println(g.checkEdge(1, 4));
	}

}
