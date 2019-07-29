package ca.jrvs.challenge;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

//Average O(log n)
//worst O(n)
public class BST<T extends Comparable<T>> implements Iterable<T> {
    private Node<T> root;
    private Comparator<T> comparator;//used to compare two object of diffrent class

    public BST() {
        root = null;
        comparator = null;
    }

    public BST(Comparator<T> comp) {
        root = null;
        this.comparator = comp;
    }

    private int compare(T x, T y) {
        if (comparator == null)
            return x.compareTo(y);
        else
            return comparator.compare(x, y);
    }

    //////////////Insert////////////////////////
    public void insert(T d) {
        root = insert(root, d);
    }

    public Node<T> insert(Node<T> val, T d) {
        if (val == null) {
            return new Node<T>(d);
        }
        if (compare(d, val.data) == 0)
            return val;
        if (compare(d, val.data) < 0)
            val.left = insert(val.left, d);
        else
            val.right = insert(val.right, d);
        return val;
    }

    //////////////Search////////////////////////
    public boolean search(T toSearch) {
        return search(root, toSearch);
    }

    private boolean search(Node<T> d, T toSearch) {
        if (d == null)
            return false;
        else if (compare(toSearch, d.data) == 0)
            return true;
        else if (compare(toSearch, d.data) < 0)
            return search(d.left, toSearch);
        else
            return search(d.right, toSearch);
    }

    //////////////Delete///////////////////////////
    public void delete(T toDelete) {
        root = delete(root, toDelete);
    }

    private Node<T> delete(Node<T> d, T toDelete) {
        if (d == null)
            throw new RuntimeException("Cannot Delete");
        else if (compare(toDelete, d.data) < 0)
            d.left = delete(d.left, toDelete);
        else if (compare(toDelete, d.data) > 0)
            d.right = delete(d.right, toDelete);
        else {
            if (d.left == null)
                return d.right;
            else if (d.right == null)
                return d.left;
            else {
                d.data = retrieveData(d.left);
                d.left = delete(d.left, d.data);
            }
        }
        return d;
    }

    private T retrieveData(Node<T> d) {
        while (d.right != null)
            d = d.right;
        return d.data;
    }

    ///////////////////Traversal//////////////////////
    public void preorderTraversal() {
        preOrderHelper(root);
    }

    private void preOrderHelper(Node r) {
        if (r != null) {
            System.out.print(r + " ");
            preOrderHelper(r.left);
            preOrderHelper(r.right);
        }
    }

    public void inorderTraversal() {
        inOrderHelper(root);
    }

    private void inOrderHelper(Node r) {
        if (r != null) {
            inOrderHelper(r.left);
            System.out.print(r + " ");
            inOrderHelper(r.right);
        }
    }

    public void postorderTraversal() {
        postOrderHelper(root);
    }

    private void postOrderHelper(Node r) {
        if (r != null) {
            postOrderHelper(r.left);
            postOrderHelper(r.right);
            System.out.print(r + " ");
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (T data : this)
            sb.append(data.toString());
        return sb.toString();
    }

    public Iterator<T> iterator() {
        return new MyIterator();
    }

    //////////////NODE//////////////////////////
    public static class Node<T> {
        private T data;
        private Node<T> left, right;

        public Node(T data, Node<T> left, Node<T> right) {
            this.left = left;
            this.right = right;
            this.data = data;
        }

        public Node(T data) {
            this(data, null, null);
        }

        public String toString() {
            return data.toString();
        }

    }

    public static class MyComp implements Comparator<Integer> {
        public int compare(Integer x, Integer y) {
            return y - x;
        }
    }

    private class MyIterator implements Iterator<T> {
        Stack<Node<T>> stk = new Stack<Node<T>>();

        public MyIterator() {
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            return null;
        }

        public void remove() {
        }
    }
}