class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> h1=new HashMap<>();boolean b=false;int count=0;
       if(s.length()!=t.length())
         b=false;
       else{
       for(int i=0;i<s.length();i++){
         if(h1.containsKey(s.charAt(i))){
             if(h1.get(s.charAt(i))==t.charAt(i)){
                b=true;
             }
             else{
              b=false;
              break;
             }
         }else{
            count++;
            if(!(h1.containsValue(t.charAt(i)))){
            h1.put(s.charAt(i),t.charAt(i));
            b=true;
            }
         }
       } 
       }
       if(count!=h1.size())
         b=false;
       return b;
    }
}
