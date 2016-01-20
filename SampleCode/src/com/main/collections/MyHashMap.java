package com.main.collections;

public class MyHashMap<K, V> {

    private int DEFAULT_BUCKET_COUNT = 10;

    private Entry<K, V>[] buckets;

    class Entry<K, V> {

	private K key;
	private V value;
	private Entry<K, V> next;

	public Entry(K key, V value) {
	    this.key = key;
	    this.value = value;
	}

	/**
	 * @return the key
	 */
	public K getKey() {
	    return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(K key) {
	    this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
	    return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(V value) {
	    this.value = value;
	}

	/**
	 * @return the next
	 */
	public Entry<K, V> getNext() {
	    return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(Entry<K, V> next) {
	    this.next = next;
	}

    }

    public MyHashMap() {
	buckets = new Entry[DEFAULT_BUCKET_COUNT];
    }

    public MyHashMap(int capacity) {
	buckets = new Entry[capacity];
    }

    public V get(K key) {
	if (key == null) {
	    throw new IllegalArgumentException("Key can not be null");
	}
	int bucketIndex = hashforKey(key);
	Entry<K, V> entry = buckets[bucketIndex];
	while (entry != null && !key.equals(entry.getKey())) {
	    entry = entry.next;

	}
	return entry != null ? entry.getValue() : null;

    }

    public void put(K key, V value) {
	if (key == null) {
	    throw new IllegalArgumentException("Key can not be null");
	}
	int bucketIndex = hashforKey(key);
	Entry<K, V> entry = buckets[bucketIndex];
	if (entry != null) {
	    boolean done = false;
	    while (!done) {
		if (key.equals(entry.getKey())) {
		    entry.setValue(value);
		} else if (entry.getNext() == null) {
		    entry.setNext(new Entry<K, V>(key, value));
		}

		entry = entry.getNext();
	    }
	} else {
	    buckets[bucketIndex] = new Entry<K, V>(key, value);
	}

    }

    private int hashforKey(K key) {
	int index = key.hashCode() % buckets.length;
	return index;
    }

}
