http://www.careercup.com/question?id=14804692
A file contains a billion integers, try to find any one integer that is not in the file.

- Steve on
public class Solution{
  public int findFirstNotIn(int[] arr){
    byte[] ret = new byte[(1<<30)+1];
    for(int a in arr){
      if(a>0)
          ret[a>>2] = 1;
    }
    for(int i = 0 ; i < ret.length ; i++){
       if(ret[i] == 0) return i;
    }
    return 0;
  }
}
