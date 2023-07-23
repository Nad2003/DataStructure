package com.Nadeem;

import java.util.ArrayList;
import java.util.Arrays;

public class coustemLinklist<T> {
    private Object[] data;
    private int size=0;
    private int DEFULT_SIZE=10;

    public coustemLinklist() {

        this.data = new Object[DEFULT_SIZE];
    }
    public void add(int item){

        if(isfull()){
            reSize();
        }
      data[size++]=item;
    }

    private void reSize() {
        Object[] temp =new Object[data.length * 2];
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isfull() {
        return size==data.length;
    }
public T remove(){
    return (T)(data[--size]);
}
public T get(int index){
        return (T)(data[index]);
}
public int size(){
        return size;
}
public  boolean containes(T item){
    for (int i = 0; i < size; i++) {
        if(item==data[i]){
            return true;
        }
    }
    return false;
}
    @Override
    public String toString() {
        return "coustemLinklist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", TOTAL_SIZE=" + data.length +
                '}';
    }

    public static void main(String[] args) {
        coustemLinklist<Integer> list = new coustemLinklist();
//        ArrayList<Integer> list1=new ArrayList<>();
//list1.
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);
        System.out.println(list.get(6));
        System.out.println(list.remove());
        System.out.println(list.containes(12));
    }



}
