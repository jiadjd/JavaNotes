package BreadthFirstSearch;

import java.util.*;

public class Graph {
	
	int[][] matrix;
	ArrayList<Node> nodes;
	
	Graph(int size) {
		matrix = new int[size][size];
		nodes = new ArrayList<>();
	}
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	public void addEdge(int src, int dst) {
		matrix[src][dst] = 1;
	}
	
	public boolean checkEdge(int src, int dst) {
		return matrix[src][dst] == 1;
	}
	
	public void print() {
		System.out.print("  ");
		for(Node node : nodes) {
			System.out.print(node.data + " ");
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
	
	public void breadthFirstSearch(int src) {
		boolean[] visited = new boolean[matrix.length];
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(src);
		visited[src] = true;
		
		//System.out.println(nodes.get(src).data + " = visited");
		
		
		while(queue.size() != 0) {
			
			src = queue.poll();
			
			System.out.println(nodes.get(src).data + " = visited");
			
			for(int i = 0; i < matrix[src].length; i++) {
				if(matrix[src][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
 }
