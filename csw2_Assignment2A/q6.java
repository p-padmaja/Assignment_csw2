package csw2_Assignment2A;
import java.util.*;
public class q6 {
            private int V; // number of vertices
		    private List<Integer>[] adjList; // adjacency list
		    public q6(int vertices) {
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
		    // depth-first search traversal of the graph
		    public void DFS(int startVertex) {
		        boolean[] visited = new boolean[V];
		        Stack<Integer> stack = new Stack<>();
		        visited[startVertex] = true;
		        stack.push(startVertex);

		        while (!stack.isEmpty()) {
		            int v = stack.pop();
		            System.out.print(v + " ");

		            for (int adjVertex : adjList[v]) {
		                if (!visited[adjVertex]) {
		                    visited[adjVertex] = true;
		                    stack.push(adjVertex);
		                }
		            }
		        }
		    }
		    public static void main(String[] args) {
		        q6 graph = new q6(5);
		        graph.addEdge(0, 1);
		        graph.addEdge(0, 2);
		        graph.addEdge(1, 3);
		        graph.addEdge(1, 4);

		        System.out.println("DFS traversal starting from vertex 0:");
		        graph.DFS(0);
		    }
	}


