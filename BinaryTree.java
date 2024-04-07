import java.util.*;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    static int index = -1;

    static Node builtTree(int[] nodes) {
        if (index == nodes.length - 1)
            return null;
        index++;
        if (nodes[index] == -1)
            return null;

        Node newNode = new Node(nodes[index]);
        System.out.print(newNode.data + " ");
        newNode.left = builtTree(nodes);
        newNode.right = builtTree(nodes);
        return newNode;
    }

    // preorder(root+left+right)
    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder(left+root+right)
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // posorder(left+right+root)
    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);
        return (leftNode + rightNode + 1);
    }

    static int sumofNode(Node root) {
        if (root == null)
            return 0;
        int leftsum = sumofNode(root.left);
        int rigthsum = sumofNode(root.right);
        return leftsum + rigthsum + root.data;
    }

    static int height(Node root) {
        if (root == null)
            return 0;
        int l = height(root.left);
        int r = height(root.right);
        int height = Math.max(l, r) + 1;
        return height;
    }

    // insertion
    static void insertion(Node root, int d) {
        if (root == null) {
            root = new Node(d);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {
            root = q.peek();
            q.remove();

            if (root.left == null) {
                root.left = new Node(d);
                break;
            } else
                q.add(root.left);

            if (root.right == null) {
                root.right = new Node(d);
                break;
            } else
                q.add(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = tree.builtTree(nodes);
        System.out.println();
        System.out.println("preorder");
        preorder(root);
        System.out.println();
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
        System.out.println();
        System.out.println("levelorder");
        levelorder(root);
        System.out.println();
        System.out.println("countNode");
        System.out.println(countNode(root));
        System.out.println();
        System.out.println("sumofNode");
        System.out.println(sumofNode(root));
        System.out.println();
        System.out.println("height");
        System.out.println(height(root));
        int d = 12;
        insertion(root, d);
        System.out.println();
        System.out.println("inorder");
        inorder(root);

    }
}
