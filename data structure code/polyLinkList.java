package com.Nadeem;

public class polyLinkList {
    private Node head;
    private Node tail;
    private class Node{
     float coef;
     int expo;
     Node next;

        public Node(float coef, int expo) {
            this.coef = coef;
            this.expo = expo;
        }

        public Node(float coef, int expo, Node next) {
            this.coef = coef;
            this.expo = expo;
            this.next = next;
        }
    }
    public void insert(float co,int expo){
        Node temp=new Node(co,expo);
        if(head==null){
            temp.next=head;
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;

        }
    }
    public void display(){

        Node ptr=head;
        while (ptr!=null){
            System.out.printf(ptr.coef+"x^"+ptr.expo);

            ptr=ptr.next;
            System.out.print("  +  ");
        }
    }
 public polyLinkList add(polyLinkList l1,polyLinkList l2){
        Node p1=l1.head;
        Node p2=l2.head;
     polyLinkList l3=new polyLinkList();

        while(p1!=null&&p2!=null){
            if(p1.expo>p2.expo){
                l3.insert(p1.coef,p1.expo);
                p1=p1.next;
            } else if (p1.expo<p2.expo) {
                l3.insert(p2.coef,p2.expo);
                p2=p2.next;
            }else {

                l3.insert((p1.coef+p2.coef),p1.expo);
                p1=p1.next;
                p2=p2.next;
            }
        }
        while (p1!=null){
            l3.insert(p1.coef,p1.expo);
            p1=p1.next;

        }
     while (p2!=null){
         l3.insert(p2.coef,p2.expo);
         p2=p2.next;

     }
      return l3;
 }



    public static void main(String[] args) {
        polyLinkList list=new polyLinkList();
        polyLinkList list1=new polyLinkList();
        polyLinkList list3=new polyLinkList();
        list.insert(5,3);
        list.insert(2,2);
        list.insert(1,0);
        list.display();
        System.out.println();
        list1.insert(6,4);
        list1.insert(7,2);
        list1.insert(8,0);
        list1.display();
        list3= list.add(list,list1);
        System.out.println();
        list3.display();
    }
}
