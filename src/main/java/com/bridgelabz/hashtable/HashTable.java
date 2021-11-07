package com.bridgelabz.hashtable;

public class HashTable<K, V> {
    LinkedList<K> linkedList;

    public HashTable() {
        linkedList = new LinkedList<K>();
    }


    public V get(K key) {
        MapNode<K, V> mapNode = this.linkedList.search(key);
        if (mapNode == null) {
            return null;
        } else {
            return mapNode.getValue();
        }
    }


    public void add(K key, V value) {
        MapNode mapNode = this.linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MapNode(key, value);
            this.linkedList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }
}
