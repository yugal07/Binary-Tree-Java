package Solutions;

public class Traversals {
    public static void preorder(TreeNode root){
        if(root == null) return;

        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(TreeNode root){
        if(root  == null) return;

        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public static void postorder(TreeNode root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
}
