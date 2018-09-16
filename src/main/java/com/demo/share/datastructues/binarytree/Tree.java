package com.demo.share.datastructues.binarytree;

import java.util.List;

/**
 * ..
 *
 * @author 杨华
 * @date 2018-09-10 10:16
 */
public class Tree {
    public Node root;

    public Node find(int key) {
        Node current = root;
        while (current.getiData() != key) {
            if (current.getiData() > key) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.setiData(id);
        newNode.setfData(dd);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if (id > current.getiData()) {
                    current = current.getRightChild();
                    if(current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                } else {
                   current = current.getLeftChild();
                   if (current == null) {
                       parent.setLeftChild(newNode);
                       return;
                   }
                }
            }
        }
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        //先寻找的key的位置
        while (current.iData != key) {
            parent = current;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.getLeftChild();
            } else {
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null) {
                return false;
            }
        }
        //当没有子节点时处理
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
            return true;
        }
        //当删除有一个子节点的情况的节点
        else if (current.rightChild == null) {
            if (root == current) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }
        return false;
    }
 }
