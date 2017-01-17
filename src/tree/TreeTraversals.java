package tree;

import com.sun.source.tree.BinaryTree;

import java.util.Objects;

/**
 * Created by xy on 2017/1/11.
 */
public class TreeTraversals {

    class sibTree{
        sibTreeNode root;
        int size;
    }
    class binaryTree{
        BinaryTreeNode root;
        int size;
    }

    class sibTreeNode{
        Objects item;
        sibTreeNode parent;
        sibTreeNode firstChildNode;
        sibTreeNode nextSiblingNode;
        public void visit(){

        }

        /*
        * 课件里的这些方法都写在了class sibTreeNode 这个类里，记得如果要写在tree类里是node里而不是tree里
        * all the traversals we considered takes O(n) time, n is the number of node in the tree
        *
        * 1. preorder
        * visit each node before recursively visit its children, which are visited from left to right
        * the root is visited first
        * use a stack, and push each node’s children in reverse order--from right to left,so they pop off the stack in order from left to right, you perform preorder traversals.
        */
        public void preOrder(){
            this.visit();
            if(firstChildNode!=null) firstChildNode.preOrder();
            if(nextSiblingNode!=null) nextSiblingNode.preOrder();
        }
        /*
        * 2. postorder
        * visit each node's children(from left to right) before the node itself.
        */
        public void postOrder(){
            if(firstChildNode!=null) firstChildNode.postOrder();
            this.visit();
            if(nextSiblingNode!=null) nextSiblingNode.postOrder();
        }

    }

    //structure of Binary tree node
    class BinaryTreeNode{
        Object item;
        BinaryTreeNode parent;
        BinaryTreeNode left;
        BinaryTreeNode right;
        public void visit(){

        }
        /*
       * binar trees allow for an
       * 3. in-order tranversal
       * recursively visit the root's left subtree(rooted at the left children), then the root itself, then the root's right subtree
       * here for binary tree
       */
        public void inOrder(){
            if(left!=null) left.inOrder();
            this.visit();
            if(right!=null) right.inOrder();
        }
        /*
        * In a _level-order_ traversal, you visit the root, then all the depth-1 nodes(from left to right), then all the depth-2 nodes, et cetera.
        * Unlike the three previous traversals, a level-order traversal is not straightforward to define recursively.
        * Use a queue, which initially contains only the root.  Then repeat the following steps:
            - Dequeue a node.
            - Visit it.
            - Enqueue its children (in order from left to right).
            Continue until the queue is empty.
        */
    }

}


