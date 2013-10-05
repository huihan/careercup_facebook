http://www.careercup.com/question?id=15503949

Given a function KNOWS(A,B), which returns 1 if A knows B (and not necessarily the other way around) and 0 if A does not know B. 

A Celebrity is one who does not know anyone, 
and one who is known by everybody. 

For a list of N people, find all celebrities in linear time.

if cur don't know next one means:  next one is not celebrity so i++;
if cur know next one means: cur is not celebrity so cur = i;
the people between i and cur don't known by cur so they are all not celebrity.
{{{
  public Person findCelebrity(Person[] arr){
    ine len = arr.length;
    int cur = 0;
    for(int i = 1; i < len ; i++){
      if(Knows(arr[cur] , arr[i] ) == 1){
          cur = i;
      }
    }
    return arr[cur];
  }
}}}
