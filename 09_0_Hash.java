http://www.careercup.com/question?id=65732
Divide a list of numbers into group of consecutive numbers but their original order should be preserved? 
e.g. 
8,2,4,7,1,0,3,6 

2,4,1,0,3 and 8,7,6 

obviously in shortest time and space.


There is a O(n) solution: 
1. Convert the array to a Linklist and build a Hashtable point to each Linklist nodes. 
2. Create an array used to indicate the group number. 
3. Take the head of the Linklist and mark its corresponding group number of the array as 1. 
4. Assume the value of the Linklist head is n. set MIN= MAX= n. 

5. Check if MIN-1 and MAX+1 is in the Hashtable. If yes, remove them from the Hashtable and mark the corresponding element as group 1. MIN = MIN -1 if (MIN-1) is there and MAX = MAX + 1 if MAX +1 is identified. 
6. Continue step until both MIN and MAX cannot be identified. 
7. add group number by 1 and go to Step 3, until there is no element in the LinkList. 
8. now we have an array of group numbers with the same index as the original array and we can build the group.

- Anonymous 
