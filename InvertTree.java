class Tree {
    char val;
    Tree left;
    Tree right;

    Tree(char val) {
        this.val = val;
    }
}

public class InvertTree {

    public Tree invertTree(Tree root) {
        if (root == null) {
            return null; 
        }

        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        
        Tree a = new Tree('f');
        Tree b = new Tree('e');
        Tree c = new Tree('d');
        Tree d = new Tree('c');
        Tree e = new Tree('b');
        Tree f = new Tree('a');

        a.left = b; 
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        InvertTree obj = new InvertTree();
        obj.invertTree(a);

        System.out.println("Tree inverted successfully.");
    }
}

