package com.Nadeem;

public class circulerQueue {
    protected int[] data;
    private static final int DEFULTE_SIZE=10;
    protected int end=0;
    protected int frount=0;
    protected int size=0;
    public circulerQueue() {
        this(DEFULTE_SIZE);
    }

    public circulerQueue(int size) {
        this.data =new int[size];
    }

    private boolean isfull(){
        return size==data.length;
    }
    private boolean isempty(){

        return size==0;
    }
    public void insert(int value) throws Exception{
        if(isfull()){
          throw new Exception("I AM NOT ABLE TO INSERT IN THE QUEUE ");
        }

        data[end++]=value;
        end=end%data.length;
        size++;

    }

    public int delete() throws Exception {
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        int val=data[frount++];
        frount=frount%data.length;
        size--;
        return val;
    }

    public void display() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        for (int i = 0; i < size; i++) {
            System.out.print("<-"+data[i]);
        }
    }
}

