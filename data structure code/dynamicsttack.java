package example;

public class dynamicsttack extends coustomestack{


    public dynamicsttack() {
        super();
    }

    public dynamicsttack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) throws Exception {
        if(this.isfull()){
            int[] temp=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }

        return super.push(item);
    }
}
