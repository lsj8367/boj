package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1991 {

    private static class Node {

        char value;

        Node left;
        Node right;

        public Node(final char value) {
            this.value = value;
        }

    }

    private static class Tree {

        Node root;

        public void create(char value, char leftValue, char rightValue) {
            if (root == null) {
                root = new Node(value);

                if (leftValue != '.') {
                    root.left = new Node(leftValue);
                }

                if (rightValue != '.') {
                    root.right = new Node(rightValue);
                }

            } else {
                search(root, value, leftValue, rightValue);
            }
        }

        public void search(final Node root, final char value, final char leftValue, final char rightValue) {
            if (root == null) {
                return;
            }

            if (root.value == value) {
                if (leftValue != '.') {
                    root.left = new Node(leftValue);
                }

                if (rightValue != '.') {
                    root.right = new Node(rightValue);
                }
            } else {
                search(root.left, value, leftValue, rightValue);
                search(root.right, value, leftValue, rightValue);
            }
        }

        public void preOrder(Node root) {
            System.out.print(root.value);
            if (root.left != null) {
                preOrder(root.left);
            }

            if (root.right != null) {
                preOrder(root.right);
            }
        }

        public void inOrder(Node root) {
            if (root.left != null) {
                inOrder(root.left);
            }
            System.out.print(root.value);

            if (root.right != null) {
                inOrder(root.right);
            }
        }

        public void postOrder(Node root) {
            if (root.left != null) {
                postOrder(root.left);
            }

            if (root.right != null) {
                postOrder(root.right);
            }
            System.out.print(root.value);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        for (int i = 0; i < n; i++) {
            final char[] s = br.readLine().replaceAll(" ", "").toCharArray();
            tree.create(s[0], s[1], s[2]);
        }

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }

}
