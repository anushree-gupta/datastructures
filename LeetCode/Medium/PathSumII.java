/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    private int maxPathLen = 2000;
    private int[] currentPath = new int[maxPathLen];
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        findPath(root, targetSum, 0);
        System.gc();
        return result;
    }
    
    void findPath(TreeNode root, int targetSum, int index){
        // write a base case, which can terminte the recursive call;
        if(root== null){
            return;
        }
        //  Add the current root value to the currentPath, to keep a track
        currentPath[index]=root.val;
        
        // iterate over the tree nodes; evaluate for targeted sum and leaf node.
        if(root.val== targetSum && root.left== null && root.right == null){
        // add the currentPath to the result
             List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i <= index; i++) {
                list.add(currentPath[i]);
            }
            result.add(list);
            return;
        }
       
        // call recursive function
        findPath(root.left, targetSum-root.val, index+1);     
        findPath(root.right, targetSum-root.val, index+1);
        
        
    }
    
}
