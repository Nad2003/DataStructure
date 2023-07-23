package com.Nadeem;

public class coustemDoubleLink {
    Node head;
    Node tail;
   private class Node{
       int val;
       Node next;
       Node prev;

       public Node(int val, Node next, Node prev) {
           this.val = val;
           this.next = next;
           this.prev = prev;
       }

       public Node(int val) {
           this.val = val;
       }

   }

   public void insertatend(int item){
       Node temp=new Node(item);
       if(head==null){
           head=temp;
           tail=head;
       }else{
           tail.next=temp;
           temp.prev=tail;
           tail=temp;
       }

   }
   public void insertatbeg(int item){
       Node temp=new Node(item);
      temp.prev=null;

       if(head==null){
          head=temp;
          tail=head;
       }else{
          temp.next=head;
          head.prev=temp;
          head=temp;
       }

       head=temp;
   }
   public void displayForverd(){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.val+"->");
           temp=temp.next;
       }
   }
    public void displayRivers(){
       Node temp=tail;
       while(temp!=null){
           System.out.print(temp.val+" <-");
           temp=temp.prev;
       }
    }


    public void isertAtGiven(int item,int index){
       Node temp= new Node(item);
        Node ptr=head;
       while(ptr!=null){
           if(ptr.val==index){
               Node ptr1=ptr.next;
               ptr.next=temp;
               temp.next=ptr1;
               ptr1.prev=temp;
               temp.prev=ptr;
           }
           ptr=ptr.next;
       }
    }
public int  deleteatBeg(){
       int v=head.val;
       head=head.next;
       head.prev=null;
       return v;
}
public int deleteAtEnd(){
       int v=tail.val;
       tail=tail.prev;
       tail.next=null;
       return v;
}


    public void deleteAtGiven(int index){

        Node ptr=head;
        while(ptr!=null){
            if(ptr.next.val==index){
                Node ptr1=ptr.next;
                ptr.next=ptr.next.next;
                ptr1=ptr1.next;
                ptr1.prev=ptr1.prev.prev;
                break;

            }
            ptr=ptr.next;

        }
    }
    public static void main(String[] args) {

        coustemDoubleLink list=new coustemDoubleLink();
        list.insertatbeg(6);
        list.insertatbeg(7);
        list.insertatbeg(8);
        list.insertatbeg(9);
//        list.displayForverd();
//        System.out.println();
//        list.displayRivers();
//        list.isertAtGiven(5,7);
//        System.out.println();
//        list.displayForverd();
//        System.out.println("BEGNING ELEMENT IS DELETED "+list.deleteatBeg());
//        list.displayForverd();
//        System.out.println();
//        System.out.println("END ELEMENT IS DELETED"+list.deleteAtEnd());
//        list.displayForverd();
        list.insertatend(5);
        list.insertatbeg(10);
        list.insertatend(4);
        list.displayForverd();
        System.out.println();
        list.deleteAtGiven(5);
        list.displayForverd();
    }
}
