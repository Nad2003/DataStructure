package com.Nadeem;

public class CoustemCirculerList {
    private Node head;
    private Node tail;
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public void addAtBeg(int data){
        Node node =new Node(data);
        if (tail==null){
            head=node;
            tail=head;
            node.next=head;
        }else{

            node.next=head;
            head=node;
            tail.next=head;
        }

    }


    public void insertAtEnd(int data){
        Node node=new Node(data);
        if (tail==null){
            head=node;
            tail=head;
            node.next=head;
        }else{
            tail.next=node;
            tail=node;
            tail.next=head;
        }
    }
    public void insertAtAfter(int index,int data){
        Node node=new Node(data);
        Node temp=head;
        Node temp2=head;
        if(tail==null){
            head=node;
            tail=head;
            node.next=head;
        }
        else{
    while(temp!=tail){
        if(temp.val==index){
        temp2=temp.next;
       node.next=temp2;
       temp.next=node;
    }
        temp=temp.next;
}
        }
    }
    public void displayForverd(){
        Node temp=tail.next;
        do{
            System.out.print(temp.val+"->");
            temp=temp.next;
        }while (temp!=tail.next);
    }

    public int deleteAtBeg(){

        Node temp=head;
        tail.next=head.next;
        head=head.next;
        int v=temp.val;
        temp.next=null;
        return v;
    }

        public void deleteAtEnd(){
        Node temp=head;
        while (temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        tail.next=head;
        }
    public static void main(String[] args) {
        CoustemCirculerList list=new CoustemCirculerList();
        list.addAtBeg(5);
        list.addAtBeg(4);
        list.addAtBeg(3);
        list.insertAtEnd(6);
        list.insertAtAfter(4,9);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.insertAtEnd(10);
       list.displayForverd();
        System.out.println();
        list.deleteAtBeg();
        list.displayForverd();
        System.out.println();
        list.deleteAtEnd();
        list.displayForverd();

    }
}
