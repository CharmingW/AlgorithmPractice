package com.charmingwong.practice;

import com.sun.javafx.sg.prism.NGShape;

/**
 * Created by CharmingWong on 2017/9/7.
 */
public class SingleLinkedList {

    class Node {
        Node next;
        Object object;

        public Node(Object object) {
            this.object = object;
        }
    }

    private Node mHead;

    public SingleLinkedList(Node mHead) {
        this.mHead = mHead;
    }

    public void print() {
        Node node = mHead;
        while (node != null) {
            System.out.println(node.object);
            node = node.next;
        }
    }

    public void insert(int index, Object object) {
        //记录游标
        Node node = mHead;
        for (int i = 0; i < index; i++) {
            //被插入位置之前若有元素为空，则不能插入
            if (node == null) return;
            //游标到插入位置的前一个
            if (i == index - 1) break;
            node = node.next;
        }
        Node insertedNode = new Node(object);
        //插入操作
        insertedNode.next = node.next;
        node.next = insertedNode;
    }

    public void delete(int index) {
        Node node = mHead;
        if (node == null) return;
        for (int i = 0; i < index; i++) {
            if (node.next == null) return;
            if (i == index - 1) break;
            node = node.next;
        }
        node.next = node.next.next;
    }
}
