package tech.cqdx.datastructure;

import java.util.LinkedList;

/**
 * 无向图
 */

public class UndirectedGraph {
    private int v;//顶点个数
    private LinkedList<Vetex> adj[];//基于链表的邻接表

    static class Vetex {
        //索引下标
        int index;
        int data;
        Vetex next;

        Vetex(int index, int data, Vetex next) {
            this.index = index;
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

//    public void addEdge(int s, int t) { // 无向图一条边存两次
//        adj[s].add(t);
//        adj[t].add(s);
//    }

    public void bfs(int s, int t) {
        if (s == 5) {
            return;
        }

        boolean[] visited = new boolean[v];
    }

//    public void addNode(int i, Vetex node) {
//        adj[i].add(node.data);
//    }

    public static void main(String[] args) {
        Vetex vetex1 = new Vetex(0, 1, null);
        Vetex vetex2 = new Vetex(1, 2, null);
        Vetex vetex3 = new Vetex(2, 3, null);
        Vetex vetex4 = new Vetex(3, 4, null);
        Vetex vetex5 = new Vetex(4, 5, null);

        UndirectedGraph undirectedGraph = new UndirectedGraph(5);
        undirectedGraph.adj[0].add(vetex1);
        undirectedGraph.adj[1].add(vetex2);
        undirectedGraph.adj[2].add(vetex3);
        undirectedGraph.adj[3].add(vetex4);
        undirectedGraph.adj[4].add(vetex5);

        undirectedGraph.adj[0].add(vetex2);
        undirectedGraph.adj[1].add(vetex3);
        undirectedGraph.adj[1].add(vetex5);
        undirectedGraph.adj[1].add(vetex4);

        undirectedGraph.adj[3].add(vetex1);
        undirectedGraph.adj[3].add(vetex2);

        undirectedGraph.adj[4].add(vetex4);
        undirectedGraph.adj[4].add(vetex3);

        for (Vetex v : undirectedGraph.adj[4]) {
            System.out.println(v.index + " " + v.data);
        }
    }
}
