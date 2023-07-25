package com.Nadeem;

public class priorityqueue {
    private priorityqueue.Node frount;
    private priorityqueue.Node Rear;
    int size;
    private class Node {
        int value;
        int priority;
        priorityqueue.Node next;

        public Node(Node next) {
            this.next = next;
        }

        public Node(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }

        public Node(int value, int priority, Node next) {
            this.value = value;
            this.priority = priority;
            this.next = next;
        }
    }

    public void insert(int val,int pri){
        Node node=new Node(val,pri);
        if(frount==null){
            frount=node;
            size++;
        } else if (frount==null||pri<frount.priority) {
            node.next=frount;
            frount=node;
        } else{
            Node p=frount;
            while(p.next!=Rear && p.next.priority<=pri){
                p=p.next;
            }
            node.next=p.next;
            p.next=node;

        }
    }


    public void display() throws Exception {
        if(frount==null){
            throw new Exception("No Node is available");
        }else {
            Node p=frount;
            while(p!=null){
                System.out.print("|| "+p.value+"|"+p.priority+"|| -> ");
                p=p.next;

            }
        }
    }
    public void delete() throws Exception {
        if (frount == null) {
            throw new Exception("No Node is available");
        }
        Node p=frount;
        frount=frount.next;
        p.next=null;
    }
}
