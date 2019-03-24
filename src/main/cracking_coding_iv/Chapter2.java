package main.cracking_coding_iv;

import java.util.Objects;

/**
 * Created by johannesC on 2019/02/20.
 */
public class Chapter2 {
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1, "A");
        node.appendToTail(2, "B");
        node.appendToTail(3, "C");
        node.appendToTail(3, "C");
        node.appendToTail(3, "C");
        node.appendToTail(3, "D");
        node.appendToTail(3, "E");
        node.deleteNodeWithKey("C");
        removeDuplicates(node);
        System.out.println("Done");

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack Pop : " + stack.pop());
        System.out.println("Stack Pop : " + stack.pop());

        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Stack Pop : " + queue.remove());
        System.out.println("Stack Pop : " + queue.remove());

    }

    // A basic node impl
    static class Node<T> {

        private T data;
        private String key;
        private Node<T> next = null;

        Node(T data, String key) {
            this.data = data;
            this.key = key;
        }

        void appendToTail(T data, String key) {
            Node nodeToAdd = new Node<>(data, key);
            Node end = this;
            while (end.next != null) {
                end = end.next;
            }
            end.next = nodeToAdd;
        }

        void deleteNodeWithKey(String key) {
            Node currentNode = this;
            while (currentNode.next != null) {
                if (Objects.equals(key, currentNode.next.key)) {
                    currentNode.next = currentNode.next.next;
                    return;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }
    }

    private static void removeDuplicates(Node node) {
        Node currentNode = node;
        while (currentNode.next != null) {
            if (Objects.equals(currentNode.next.key, currentNode.key)) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    // Basic stack impl
    static class Stack<T> {

        private StackNode<T> top;

        void push(T data) {
            StackNode<T> newTop = new StackNode<>(data);
            if (top != null) {
                newTop.next = top;
            }
            top = newTop;
        }

        T pop() {
            if (top == null) {
                return null;
            } else {
                StackNode<T> nodeToReturn = top;
                top = top.next;
                return nodeToReturn.data;
            }
        }


        static class StackNode<T> {
            private T data;
            private StackNode<T> next = null;

            StackNode(T data) {
                this.data = data;
            }
        }
    }

    // A basic queue
    static class Queue<T> {
        private QueueNode<T> firstAdded;
        private QueueNode<T> lastAdded;


        void add(T data) {
            QueueNode<T> newItem = new QueueNode<>(data);

            if (lastAdded != null) {
                lastAdded.next = newItem;
            }
            lastAdded = newItem;

            if (firstAdded == null) {
                firstAdded = lastAdded;
            }
        }

        T remove() {
            T data = firstAdded.data;
            firstAdded = firstAdded.next;
            return data;
        }

        static class QueueNode<T> {
            private T data;
            private QueueNode<T> next = null;

            QueueNode(T data) {
                this.data = data;
            }
        }
    }
}
