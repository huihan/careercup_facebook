Push all the zero's of a given array to the end of the array. In place only. Ex 1,2,0,4,0,0,8 becomes 1,2,4,8,0,0,0

{{{

void PushZeros(int[] arr ){ 
  int pos = 0 ;
  for(int i = 0 ; i < arr.length ; i++){
    if(arr[i]!= 0) arr[pos++] = arr[i];
  }
  for(int i = pos ; i < arr.length ; i++)
    arr[i] = 0;
}

}}}
