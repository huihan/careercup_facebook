You are given an array of N elements.arrange array in such a way that sum of any cunsucative k numbers are divisible 
by NUM.if not possible print -1.(it may possible that there are many solution possible then return any one) 

For example: 
N=6 
k=3 
NUM=63 
array={80,17,90,82,27,19} 

Answer:{19,17,27,82,80,90} 
any 3 cunsucative no. like (27+82+80)%63=0 
another solution={27,19,17,90,82,80} 

may be a hint :try to group all no.'s in mod NUM map and use vector and map.



here is a property should be noticed: 
if ai + ... + ai+k mod num == ai+1 + ... + ai+k+1 mod num, (ai+k+1 - ai) mod num == 0 
let a = N/k, b = N%k, if solution exist, there should be way to partition numbers in such a way: 
1. totally k groups, N%k groups have N/k + 1 numbers each, and (k-N%k) groups have N/k numbers each. The numbers in each group are in the same mod set. (same remainder mod NUM) 
2. The sum of k groups' remainder divisible by NUM. 

Then algorithm is quite trivial, group numbers by remainder, with b groups of a + 1 numbers and k-b groups of a numbers, check the sum of remainder.
