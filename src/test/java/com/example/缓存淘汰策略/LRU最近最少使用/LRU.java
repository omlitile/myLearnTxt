package com.example.缓存淘汰策略.LRU最近最少使用;

import java.util.LinkedList;
import java.util.List;

public class LRU {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        lruCache.insert(node1);
        lruCache.insert(node2);
        lruCache.insert(node3);
        lruCache.insert(node4);
        lruCache.insert(node5);
        lruCache.insert(node6);
        lruCache.insert(node3);
        System.out.println(lruCache.toString());

    }
}
class LRUCache{
    private Integer size = 0;
    private Integer maxSize;
    private ListNode head = new ListNode(0);

    public LRUCache(Integer maxSize){
        this.maxSize = maxSize;
    }

    public void insert(ListNode listNode){
        if(size < maxSize){
            //未满
            if(isExist(listNode)){
                //在链表里
                //找到节点，删除
                ListNode node = head.next;
                while(node != null){
                    if(node.val == listNode.val){
                        node.next = node.next.next;
                        break;
                    }
                    node = node.next;
                }
            }
            //不在链表里
            //直接插入到头结点
        }else{
            //满了
            if(isExist(listNode)){
                //1，在链表里，就找到那个结点，删除
                ListNode node = head;
                while(node.next != null){
                    ListNode temp = node.next;
                    if(temp.val == listNode.val){
                        node.next = node.next.next;
                        break;
                    }
                    node = node.next;
                }
            }else{
                //2，不在链表里，边就直接删除最后一个元素
                ListNode node = head.next;
                while(node != null){
                    if(node.next.next == null){
                        node.next = null;
                        break;
                    }
                    node = node.next;
                }
            }
        }
        //在头结点插入
        if (head.next != null) {
            ListNode secondNode = head.next;
            listNode.next = secondNode;
        }
        head.next = listNode;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode node = head.next;
        while(node != null){
            sb.append(node.val).append(",");
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private Boolean isExist(ListNode listNode){
        ListNode node = head.next;
        while(node != null){
            if(node.val == listNode.val){
                return true;
            }
            node = node.next;
        }
        return false;
    }
}



