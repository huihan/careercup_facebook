{{{
public class Solution{
    
    public int getMedian(int[] arr){
        heapCat cat = new heapCat();
        for(int i = 0 ; i < arr.length ; i++){
            heapCat.add(arr[i]);
        }
        return heapCat.getMid();
    }
}
class heapCat{ 
    int len;
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> rgith;
    public heapCat(){ 
        int len = 0;
        left = new PriorityQueue<Integer>(11, Collections.reverseOrder());
        left.add(Integer.MIN_VALUE);
        right = new PriorityQueue<Integer>();
        right.add(Integer.MAX_VALUE);
    }
    public void add(int a){
        int l = left.size();
        int r = right.size();
        if(l == r) {
            if(left.peek() < a )
                if(right.peek() > a)
                    left.add(a);
                else{
                    left.add(right.poll());
                    right.add(a);
                }
            else left.add(a);
        }
        else{
            if(left.peek() < a) right.add(a);
            else{
              right.add(left.poll());
              left.add(a);
            }
        }
    }
    public int getMid(){
        if(left.size() > right.size()) return left.peek();
        return (left.peek() + right.peek())/2;
    }
}
}}}
