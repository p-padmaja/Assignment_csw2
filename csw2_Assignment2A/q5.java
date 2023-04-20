package csw2_Assignment2A;
import java.util.*;
	public class q5 {
	    private int V; // number of vertices
	    private List<Integer>[] adjList; // adjacency list
	    public q5(int vertices) {
	        V = vertices;
	        adjList = new ArrayList[V];
	        for (int i = 0; i < V; i++) {
	            adjList[i] = new ArrayList<>();
	        }
	    }
	    // add an edge to the graph
	    public void addEdge(int u, int v) {
	        adjList[u].add(v);
	    }
	    // breadth-first search traversal of the graph
	    public void q5(int startVertex) {
	        boolean[] visited = new boolean[V];
	        ArrayDeque<Integer> queue = new ArrayDeque<>();
	        visited[startVertex] = true;
	        queue.add(startVertex);
	        while (!queue.isEmpty()) {
	            int v = queue.poll();
	            System.out.print(v + " ");
	            for (int adjVertex : adjList[v]) {
	                if (!visited[adjVertex]) {
	                    visited[adjVertex] = true;
	                    queue.add(adjVertex);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        q5 graph = new q5(5);
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 3);
	        graph.addEdge(1, 4);
	        System.out.println("BFS traversal starting from vertex 0:");
	        graph.q5(0);
	    }
	}

