class Node {  
    public int value;  
    public Node left, right;  
  
    public Node(int element)  
    {  
        value = element;  
        left = right = null;  
    }  
}  
  
class PreorderTraversal {  
    Node root;  
  
    PreorderTraversal() { root = null; }  
  
    void traversePreorder(Node node)  
    {  
        if (node == null)  
            return;  
        System.out.print(node.value + " ");  
        traversePreorder(node.left);  
        traversePreorder(node.right);  
    }  
  
    void traversePreorder() { traversePreorder(root); }  
  
    public static void main(String args[])  
    {  
        PreorderTraversal pt = new PreorderTraversal();  
        pt.root = new Node(37);  
        pt.root.left = new Node(27);  
        pt.root.right = new Node(47);  
        pt.root.left.left = new Node(22);  
        pt.root.left.right = new Node(32);  
        pt.root.left.left.left = new Node(12);  
        pt.root.left.left.right = new Node(25);  
        pt.root.right.left = new Node(42);  
        pt.root.right.right = new Node(57);  
        pt.root.right.right.left = new Node(52);  
        pt.root.right.right.right = new Node(67);  
  
        System.out.println();  
        System.out.println("Preorder traversal of given binary tree is - ");  
        pt.traversePreorder();  
        System.out.println();  
    }  
}  
