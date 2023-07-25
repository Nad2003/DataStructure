package com.Nadeem;

public class coustemQueue {
    private coustemQueue.Node frount;
    private coustemQueue.Node Rear;
    int size;
    private class Node {
        int value;
        coustemQueue .Node next;

        public Node(int value) {

            this.value = value;
        }

        public Node(coustemQueue .Node next)
        {
            this.next = next;
        }

        public Node(int value,coustemQueue .Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void dispaly(){
        coustemQueue .Node temp=frount;
        while(temp!=null){

            System.out.print(temp.value +"->");
            temp=temp.next;
        }
    }
    public void insert(int value){

        coustemQueue.Node node=new  coustemQueue.Node(value);
        if (frount==null){
            frount=node;
            Rear=node;
            size++;
        }else{
            Rear.next=node;
            Rear=node;
            size++;
        }
    }

    public int delete(){
        int v=0;
        coustemQueue.Node node=frount;
        frount=frount.next;
        v=node.value;
        node.next=null;
        size--;
        return v;

    }
public int size(){
        return size;
}
    public int peek(){
        return frount.value;
    }


    public static void main(String[] args) {

    }
}
