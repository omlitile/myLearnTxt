package com.example.链表实现优先级队列;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map map = new HashMap<String,String>();
    }

}

class PList{
    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    private Node headNode;

    public PList(){
        this.headNode = new Node(-1);
    }

    public void add(Integer val){
        Node prev = headNode;
        Node curr = headNode.next;
        while(curr != null){
            if(curr.val < val){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        Node node = new Node(val);
        curr.next = node;


    }

    public void delete() throws Exception{
        if(headNode.next == null){
            throw new Exception("delete fail");
        }
        Node temp = headNode.next;
        headNode.next = temp.next;
        temp.next = null;
    }


}
