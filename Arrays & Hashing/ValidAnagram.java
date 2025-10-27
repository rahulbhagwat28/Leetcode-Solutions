class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        char[] sarray=s.toCharArray();
        char[] tarray=t.toCharArray();

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

       for(int i=0;i<sarray.length;i++)
       {
            if(!map1.containsKey(sarray[i]))
            {
                map1.put(sarray[i],1);
            }
            else {
                map1.put(sarray[i],map1.get(sarray[i])+1);
            }
       }


         for(int j=0;j<tarray.length;j++)
       {
            if(!map2.containsKey(tarray[j]))
            {
                map2.put(tarray[j],1);
            }
            else {
                map2.put(tarray[j],map2.get(tarray[j])+1);
            }
       }

       return map1.equals(map2);

    }
}
