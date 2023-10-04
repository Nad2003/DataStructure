package DSA_WITH_JAVA;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        String[] ops = {"1","C"};
//        System.out.println((int)('0'));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            String str=ops[i];
            list=find(str,list);
        }
        int sum=findThesum(list);
        System.out.println(sum);
    }

    private static int findThesum(ArrayList<Integer> list) {
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }

    public static ArrayList<Integer> find(String str,ArrayList<Integer> list){
        if(list.isEmpty()&&isint(str)){
            int n=Integer.parseInt(str);
            list.add(n);
            return list;
        }
        if(isint(str)){
            int n=Integer.parseInt(str);
            list.add(n);
            return list;
        }
        if(str=="C"){
            list.remove(list.size()-1);
            return list;
        }
        if(str=="D"){
            int n=list.get(list.size()-1);
           n= n*2;
           list.add(n);
            return list;
        }
        if(str=="+"){
            int f=list.get(list.size()-1);
            int s=list.get(list.size()-2);
            list.add(f+s);
            return list;
        }

        return list;
       }

    private static boolean isint(String s) {
        int ch=(int)(s.charAt(s.length()-1));
        if(ch>=48&&ch<=57){
            int n=(int)(Integer.parseInt(s));
            if(n>=0||n<0){
                return true;
            }
        }

      return false;
    }

//  public static void Subset(int start,int[] arr,List<Integer>inner,List<List<Integer>> outer){
//       outer.add(new ArrayList<>());
//      for (int i = start; i < arr.length; i++) {
//          int n=outer.size();
//
//          for (int j = 0; j <n ; j++) {
//             inner=new ArrayList<>(outer.get(j));
//             inner.add(arr[i]);
//             outer.add(inner);
//
//          }
//      }
//  }



}
