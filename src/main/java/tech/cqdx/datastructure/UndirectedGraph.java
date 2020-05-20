package tech.cqdx.datastructure;

import java.util.LinkedList;

/**
 * 无向图
 */

public class UndirectedGraph {
    private int v;//顶点个数
    private LinkedList<Integer> adj[];//基于链表的邻接表

    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public UndirectedGraph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) { // 无向图一条边存两次
        adj[s].add(t);
        adj[t].add(s);
    }

    public void bfs(int s, int t) {
        if (s == 5) {
            return;
        }

        boolean[] visited = new boolean[v];
    }

    public void addNode(int i, Node node) {
        adj[i].add(node.data);
    }

    public static void main(String[] args) {
        UndirectedGraph undirectedGraph = new UndirectedGraph(5);
        undirectedGraph.addEdge(1, 2);
    }
}
