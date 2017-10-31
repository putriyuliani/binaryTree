/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Driver {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        //tampilkan preorder, postorder dan inorder dari Object BT
        System.out.println("PreOrder");
        bt.preorder();
        System.out.println();
        System.out.println("PostOrder");
        bt.postorder();
        System.out.println();
        System.out.println("inOrder");
        bt.inorder();
        System.out.println("");
        BinaryTree ba = new BinaryTree();
        //ClonetoPostOrder
        System.out.println("ClonetoPostOrder");
        ba.cloneToPostOrder(bt);
        System.out.println();
        //ClonetoPreOrder
        System.out.println("ClonetoPreOrder");
        ba.cloneToPreOrder(bt);
        System.out.println();
    }
}
