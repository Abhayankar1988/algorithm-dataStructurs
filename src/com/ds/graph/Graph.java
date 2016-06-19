package com.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int V;

	private LinkedList<Integer> adjList[];

	public Graph(int v){
		this.V = v;
		adjList = new LinkedList[v];

		for(int i=0; i<v;i++){
			adjList[i] = new LinkedList<Integer>();
		}
	}



	public void addEdge(int v , int w){
		adjList[v].add(w);
	}

	public void BFS(int s){

		boolean visted [] = new boolean [V];

		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visted[s] = true;

		queue.add(s);

		while(queue.size()!=0){

			s = queue.poll();

			System.out.print(s  + " ");

			Iterator<Integer> it = adjList[s].listIterator();
			
			while(it.hasNext()){
				int n = it.next();
				if(!visted[n]){
					visted[n] = true;
					queue.add(n);
				}
			}
		}

	}
	
	
	public void DFSUtil(int s, boolean visited[]){
		
		visited[s] = true;
		
		System.out.print(s + " ");
		
		Iterator<Integer> it = adjList[s].listIterator();
		
		while(it.hasNext()){
			int n = it.next();
			if(!visited[n]){
				DFSUtil(n, visited);
			}
		}
	}
	
	public void DFS(){
		
		boolean visited[] = new boolean[V];
		
		for(int i=0; i<V;++i){
			if(visited[i] == false){
				DFSUtil(i, visited);
			}
		}
	}

	public static void main(String[] args) {

		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal "+
				"(starting from vertex 2)");

		g.BFS(2);
		
		System.out.println("");
		
		g.DFS();


	}

}
