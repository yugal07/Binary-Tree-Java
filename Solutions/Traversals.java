package Solutions;

public class Traversals {
    public static void preorder(TreeNode root){
        if(root == null) return;

        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
