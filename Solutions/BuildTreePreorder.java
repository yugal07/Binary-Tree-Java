package Solutions;


public class BuildTreePreorder {
    static int index = -1;

    public static TreeNode buildTree(int arr[]){
        index++;

        TreeNode root = new TreeNode(arr[index]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;
    }
}
