package task133;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

// Обход в глубину
public class Solution {
    static Node[] clone;
    public static Node cloneGraph(Node node) {
        if (node == null) return null;
        clone = new Node[101];
        return dfs(node);
    }

    public static Node dfs(Node node) {
        if (clone[node.val] != null) return clone[node.val];
        clone[node.val] = new Node(node.val);
        for (Node n : node.neighbors) clone[node.val].neighbors.add(dfs(n));
        return clone[node.val];
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors = Arrays.asList(node2, node4);
        node2.neighbors = Arrays.asList(node1, node3);
        node3.neighbors = Arrays.asList(node2, node4);
        node4.neighbors = Arrays.asList(node1, node3);
        Node clone = cloneGraph(node1);
        System.out.println(clone.val);
        System.out.println(clone.neighbors.get(0).val);
        System.out.println(clone.neighbors.get(1).val);
        System.out.println(clone.neighbors.get(1).neighbors.get(1).val);
    }

}
