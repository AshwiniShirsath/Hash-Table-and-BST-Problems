package com.bridgelabz.hashtable;
/*
 * @author : Ashwini
 * Remove avoidable word from the phrase “Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations”
 */
class Node <T extends Comparable<T>> {
    public T key;
	public int value;
    public Node next;

    //Node Constructor for Creating New Node
    Node(T key) {
        this.key = key;
		this.value = 1;
        this.next = null;
    }
}
