package graphs;

import java.util.Scanner;

public class AdjescencyList {

    Node[] graphs;

    class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }

    }

    public AdjescencyList(int v) {
        this.graphs = new Node[v];
    }

    public void addGraph() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < graphs.length; i++) {
            for (int j = 0; j < graphs.length; j++) {
                System.out.println("Is there an edge from " + i + " to " + j + "? (1 for yes, 0 for no): ");
                int num = sc.nextInt();
                if (num == 1) {
                    Node newNode = new Node(j);
                    newNode.next = graphs[i];
                    graphs[i] = newNode;
                }
            }
        }
    }

    // Print the adjacency list
    public void printAdjacencyList() {
        for (int i = 0; i < graphs.length; i++) {
            System.out.print(i + ": ");
            Node temp = graphs[i];
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Example usage
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        AdjescencyList adjList = new AdjescencyList(v);
        adjList.addGraph();
        System.out.println("Adjacency List:");
        adjList.printAdjacencyList();
    }

}
