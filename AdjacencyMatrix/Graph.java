package AdjacencyMatrix;

import java.util.*;

public class Graph {
	
	int[][] matrix;
	ArrayList<Node> nodes;
	
	Graph(int size) {
		matrix = new int[size][size];
		nodes = new ArrayList<>();
	}
	
	public void addNode(Node n) {
		nodes.add(n);
	}
	
	public void addEdge(int source, int des) {
		matrix[source][des] = 1;
	}
	
	public boolean checkEdge(int source, int des) {
		return matrix[source][des] == 1;
	}
	
	public void print() {
		System.out.print("  ");
		for(Node n : nodes) {
			System.out.print(n.data + " ");
		}
		System.out.println();
		for(int i = 0; i < matrix.length; i++) {
			System.out.print(nodes.get(i).data + " ");
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
