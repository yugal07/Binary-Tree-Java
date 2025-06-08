package Solutions;

import java.util.ArrayList;
import java.util.List;

// Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

// Example 1:

// Input: root = [1,null,2,3]

// Output: [3,2,1]

// Explanation:



// Example 2:

// Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

// Output: [4,6,7,5,2,9,8,3,1]

// Explanation:



// Example 3:

// Input: root = []

// Output: []

// Example 4:

// Input: root = [1]

// Output: [1]

 

// Constraints:

// The number of the nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100

public class PostorderList {
    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();

        postorderHelper(root, result);
        return result;
    }
    public static void postorderHelper(TreeNode root , List<Integer> result){
        if(root == null) return;

        postorderHelper(root.left, result);
        postorderHelper(root.right, result);
        result.add(root.val);
    }
}
