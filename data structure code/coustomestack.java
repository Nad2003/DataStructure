package example;

public class coustomestack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
 private int ptr=-1;
    public coustomestack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public coustomestack(int size) {
        this.data = new int[size];
    }
    public boolean isempty(){
        if(ptr==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean  isfull(){
        if(ptr==data.length-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean push(int item) throws Exception {
        if(isfull()){
            throw new Exception("STACK IS FULL");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception {
        if(isempty()){
            throw new Exception("Stack is empty");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("Sorry we don't have any peek element");
        }
        return data[ptr];
    }
}
