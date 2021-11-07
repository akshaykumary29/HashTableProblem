package com.bridgelabz.hashtable;

public class LinkedList<K> {
    MapNode head;
    MapNode tail;

    public void append(MapNode mapNode) {
        if (head == null) {
            head = mapNode;
            tail = mapNode;
        } else {
            this.tail.setNext(mapNode);
            this.tail = mapNode;
        }
    }

    public MapNode search(K key) {
        MapNode tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            } else {
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }
}
