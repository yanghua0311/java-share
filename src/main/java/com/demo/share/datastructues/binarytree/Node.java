package com.demo.share.datastructues.binarytree;

/**
 * ..
 *
 * @author 杨华
 * @date 2018-09-10 10:15
 */
public class Node {
    int iData;
    double fData;
    Node leftChild;
    Node rightChild;

    public int getiData() {
        return iData;
    }

    public void setiData(int iData) {
        this.iData = iData;
    }

    public double getfData() {
        return fData;
    }

    public void setfData(double fData) {
        this.fData = fData;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "iData=" + iData +
                ", fData=" + fData +
                '}';
    }
}
