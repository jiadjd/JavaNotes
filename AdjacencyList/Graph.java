package AdjacencyList;

import java.util.*;

public class Graph {

	ArrayList<LinkedList<Node>> alist;
	
	Graph() {
		alist = new ArrayList<>();
	}
	
	public void addNode(Node node) {
		LinkedList<Node> nodes = new LinkedList<>();
		nodes.add(node);
		alist.add(nodes);
	}
	
	public void addEdge(int src, int dst) {
		LinkedList<Node> currentList = alist.get(src);
		Node dstNode = alist.get(dst).get(0);
		currentList.add(dstNode);
	}
	
	public boolean checkEdge(int src, int dst) {
		LinkedList<Node> currentList = alist.get(src);
		Node dstNode = alist.get(dst).get(0);
		for(Node n: currentList) {
			if(n == dstNode) return true;
		}
		
		return false;
	}
	
	public void print() {
		for(LinkedList<Node> nodes : alist) {
			for(Node node : nodes) {
				System.out.print(node.data + " -> ");;
			}
			System.out.println();
		}
	}
	
	
}
