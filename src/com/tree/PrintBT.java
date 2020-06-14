package com.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintBT {
    Node root1;

    public static List<List<String>> print(Node node) {
        int height = HeightBT.height(node);
        int maxElements = (int) (Math.pow(2, height) - 1);
        String[][] res = new String[height][maxElements];
        for (String[] str : res)
            Arrays.fill(str, "_");
        fillElements(res, node, 0, 0, res[0].length);
        List<List<String>> ans = new ArrayList<>();
        for (String[] str : res)
            ans.add(Arrays.asList(str));
        return ans;
    }

    public static void fillElements(String[][] res, Node node, int i, int left, int right) {
        if (node == null)
            return;
        res[i][(left + right) / 2] = "" + node.data;
        fillElements(res, node.left, i + 1, left, (left + right) / 2);
        fillElements(res, node.right, i + 1, (left + right + 1) / 2, right);

    }

    public static void main(String[] args) {

        PrintBT tree = new PrintBT();

        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.right = new Node(4);
        tree.root1.right.left = new Node(5);
        tree.root1.right.right = new Node(6);
        tree.root1.right.left.left = new Node(7);

        System.out.println(HeightBT.height(tree.root1));

        System.out.println(PrintBT.print(tree.root1));

    }

}
