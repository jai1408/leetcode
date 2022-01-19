package com.dfs;

import java.util.*;

public class DFS1 {
  public static void main(String[] args) {
    int numNodes = 5;
    Map<Integer, List<Edge>> graph = new HashMap<>();
    addToGraph(graph, 0, 1, 4);
    addToGraph(graph, 0, 2, 5);
    addToGraph(graph, 1, 2, -2);
    addToGraph(graph, 1, 3, 6);
    addToGraph(graph, 2, 3, 1);
    addToGraph(graph, 2, 2, 10);
    System.out.println(dfsIterative(graph, 1, numNodes));
    System.out.println(dfsIterative(graph, 1, numNodes));
  }

  private static int dfsIterative(Map<Integer, List<Edge>> graph, int start, int n) {
    int count = 0;
    boolean[] visited = new boolean[n];
    Stack<Integer> stack = new Stack<>();

    stack.push(start);
    visited[start] = true;
    while (!stack.isEmpty()) {
      int node = stack.pop();
      count++;
      List<Edge> edges = graph.get(node);
      if (edges != null) {
        for (Edge edge : edges) {
          if (!visited[edge.to]) {
            stack.push(edge.to);
            visited[edge.to] = true;
          }
        }
      }
    }
    return count;
  }

  private static long dfsRecursive(int at, boolean[] visited, Map<Integer, List<Edge>> graph) {
    if (visited[at]) return 0L;
    visited[at] = true;
    long count = 1;
    List<Edge> edges = graph.get(at);
    if (edges != null) {
      for (Edge edge : edges) {
        count += dfsRecursive(edge.to, visited, graph);
      }
    }
    return count;
  }

  private static void addToGraph(Map<Integer, List<Edge>> graph, int from, int to, int cost) {
    List<Edge> list = graph.computeIfAbsent(from, k -> new ArrayList<>());
    list.add(new Edge(from, to, cost));
  }

  static class Edge {
    int from;
    int to;
    int cost;

    Edge(int from, int to, int cost) {
      this.from = from;
      this.to = to;
      this.cost = cost;
    }
  }
}
