package AdjacencyList;

import java.util.*;

public class Graph {

	ArrayList<LinkedList<Node>> list;
	
	Graph() {
		list = new ArrayList<>();
	}
	
	public void addNode(Node n) {
		LinkedList<Node> currentList = new LinkedList<>();
		currentList.add(n);
		list.add(currentList);
	}
	
	public void addEdge(int src, int dst) {
		LinkedList<Node> currentList = list.get(src);
		Node dstNode = list.get(dst).get(0);
		currentList.add(dstNode);
	}
	
	public boolean checkEdge(int src, int dst) {
		LinkedList<Node> currentList = list.get(src);
		Node dstNode = list.get(dst).get(0);
		for(Node n : currentList) {
			if(n == dstNode) return true;
		}
		
		return false;
	}
	
	public void print() {
		for(LinkedList<Node> ll : list) {
			for(Node n: ll) {
				System.out.print(n.data + " -> ");
			}
			System.out.println();
		}
	}
	
	
}
