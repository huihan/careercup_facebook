If a=1, b=2, c=3,....z=26. Given a string, find all possible codes that string can generate. Give a count as well as print the strings. 

For example: 
Input: "1123". You need to general all valid alphabet codes from this string. 

Output List 
aabc //a = 1, a = 1, b = 2, c = 3 
kbc // since k is 11, b = 2, c= 3 
alc // a = 1, l = 12, c = 3 
aaw // a= 1, a =1, w= 23 
kw // k = 11, w = 23

{{{
public Set<String> decode(String prefix , String code){
  Set<String> set = new HashSet<String>();
  if(code.length() == 0){
    set.add(prefix);
    return set;
  }
  if(code.charAt(0)=='0'){
    return set;
  }
  set.addAll(decode(prefix+(char)(code.charAt(0) - '1' + 'a'), code.substring(1)));
  
  if(code.length() <2) return set;
  int tem = (code.charAt(0)-'0') *10 + code.charAt(1) - '0';
  if(tem > 26) return set;
  set.addAll(decode(prefix + (char)(tem + 'a' -1) , code.substring(2));
  return set;
}


}}}
