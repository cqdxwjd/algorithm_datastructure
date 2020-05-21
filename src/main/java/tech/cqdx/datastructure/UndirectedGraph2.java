package tech.cqdx.datastructure;

import java.util.LinkedList;

/**
 * 无向图
 */

public class UndirectedGraph2 {
    private int v;//顶点个数

    transient int size = 0;

    private LinkedList<Vetex> adj[];//基于链表的邻接表

    static class Vetex {
        int data;
        Vetex next;

        Vetex(int data, Vetex next) {
            this.data = data;
            this.next = next;
        }
    }

    public UndirectedGraph2(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addVetex(int data) {
        Vetex vetex = new Vetex(data, null);
        adj[size++].add(vetex);
    }

    public void addEdge(int s, int t) {
        int position_s = findPosition(s);
        int position_t = findPosition(t);
        if (position_s == -1 || position_t == -1) {
            return;
        }
        adj[position_s].add(new Vetex(t, null));
        adj[position_t].add(new Vetex(s, null));
    }

    public int findPosition(int data) {
        for (int i = 0; i < size; i++) {
            if (data == adj[i].getFirst().data) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        UndirectedGraph2 graph = new UndirectedGraph2(5);
        graph.addVetex(1);
        graph.addVetex(2);
        graph.addVetex(3);
        graph.addVetex(4);
        graph.addVetex(5);

        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);

        for (UndirectedGraph2.Vetex v : graph.adj[4]) {
            System.out.println(v.data);
        }
    }
}
