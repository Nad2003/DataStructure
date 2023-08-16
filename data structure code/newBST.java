package com.Nadeem;

public class newBST {

    public class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }
    private Node root;
    public newBST(){

    }


    public void insert(int val){
        root=insert(this.root,val);
    }
    private Node insert(Node node,int val){
        if(node==null){
            node=new Node(val);
            return node;
        }else{
            if(val<node.val){
                node.left=insert(node.left,val);
            }else {
                node.right=insert(node.right,val);
            }

        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);

    }

    private Node rotate(Node node){
        if (height(node.left)-height(node.right)>1){
            //left heavy
            if (height(node.left.left)-height(node.left.right)>0){
                //left left case
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                //left right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left)-height(node.right)<-1){
            //left heavy
            if (height(node.right.left)-height(node.right.right)<0){
                //left left case
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
                //left right case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

 private Node rightRotate(Node p){
        Node c=p.left;
        Node t= c.right;
        p.left=t;
        c.right=p;
        c.height=Math.max(height(c.right),height(c.left)+1);
        p.height=Math.max(height(p.right),height(p.left)+1);
     return c;
 }
 private Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;
        p.left=c;
        c.right=t;
     c.height=Math.max(height(c.right),height(c.left)+1);
     p.height=Math.max(height(p.right),height(p.left)+1);
     return p;
 }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void populateSort(int[] nums){
        populateSort(nums,0,nums.length);
    }
    private void populateSort(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+end/2;
        insert(nums[mid]);
        populateSort(nums,start,mid);
        populateSort(nums,mid+1,end);

    }
public void display(){
    display(root,"Root Node");

}
  private void display(Node node, String detail){
        if(node==null){
            return;
        }

        System.out.println(node.val+detail);

        display(node.left,"Left Node"+node.val+":");
        display(node.right,"Right Node"+node.val+":");
}
public boolean isEmpty(){
        return root==null;
}
public int height(){
        return height(root);
}
private int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
}

public boolean balanced(){
        return balanced(root);
}

private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<= 1&& balanced(node.left)&&balanced(node.right);

}
}










