http://www.careercup.com/question?id=12332722

Given a list of words, L, that are all the same length, and a string, S, find the starting position of the substring of S that is a concatenation of each word in L exactly once and without any intervening characters. This substring will occur exactly once in S.. 

. 

Example:. 

L: "fooo", "barr", "wing", "ding", "wing". 

S: "lingmindraboofooowingdingbarrwingmonkeypoundcake". 

fooowingdingbarrwing.

{{{
    public void findString(String L , String[] V){
        Hashtable<String , Integer > ht = new Hashtable<String ,Integer>();
        int unitNum = V.length;
        if(unitNum == 0) return;
        int unitLen = V[0].length();
        for(int i = 0 ; i < V.length ; i++){ 
            for(String t : v) ht.put(t , -1);
            stringSearch(L , i , ht , unitNum , unitLen);
        }
    }
    public void stringSearch(String L , int start , Hashtable<String , Integer> ht , int unitNum  , int unitLen){
        int curNum = 0 , begin = 0;
        while( start+unitLen <= L.length() ){
            String tem = L.substring(start, start+unitLen);
            if(!ht.containsKey(tem)){
                curNum = 0 ;
                begin = start+unitLen;
            }
            else{
              int t = ht.get(tem);
              if(t >= begin){
                curNum -= (t - begin )/unitLen +1;
                begin = t+unitLen;
              }
              ht.put(tem , start);
              start+=unitLen;
              curNum++;
            }
            if(curNum == unitNum){
              System.out.println(L.substring(begin , start));
            }
        }
    }

}}}
