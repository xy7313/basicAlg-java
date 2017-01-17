package tree;

import java.util.Objects;

/**
 * Created by xy on 2017/1/13.
 * _binary_search_tree__invariant_:  for any node X, every key in the left subtree of X is less than or equal to X’s key, and every key in the right subtree of X is greater than or equal to X’s key.
 */
public class binarySearchTree {
    class BinaryTreeNode{
        Entry entry;
        BinaryTreeNode parent;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }
    class Entry{
        Object key;
        Object value;
    }

    class binaryTree{
        BinaryTreeNode root;
        int size;

        public Entry find(Object k){
            BinaryTreeNode node = root;
            while(node!=null){
                //课件这里是node.entry.key()应该是key()这个方法取key这个object。但我没实现这个方法，compareTo()应该是必须传入object的，刚好我前面这里key写的类型是object，所以就不加key()这个方法了，先这么凑合用
                int comp = ((Comparable) k).compareTo(node.entry.key);
                if(comp<0){
                    node = node.left;
                }else if(comp>0){
                    node = node.right;
                }else{
                    return node.entry;
                }
            }
            return null;
        }

    }
}
